package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.QuoteResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuoteResponseRepository extends JpaRepository<QuoteResponse, Long> {

    @Query(value = "SELECT * FROM quote_response_tbl qr " +
            "WHERE qr.quote_request_id = ?1 and qr.quote_accepted = 1 " +
            "LIMIT 1", nativeQuery = true)
    Optional<QuoteResponse> findAcceptedQuoteResponse(Long quoteRequestId);

    @Query(value = "SELECT qr FROM quote_response_tbl qr WHERE qr.quoteRequestId = ?1 ")
    List<QuoteResponse> findByQuoteRequestId(Long quoteRequestId);
}
