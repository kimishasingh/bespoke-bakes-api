package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteRequestRepository extends JpaRepository<QuoteRequest, Long> {

    @Query("SELECT qr FROM quote_request_tbl qr " +
            "LEFT JOIN bundle_tbl b on b.id = qr.bundleId " +
            "WHERE b.userId = ?1")
    List<QuoteRequest> findByUserId(Long userId);
}
