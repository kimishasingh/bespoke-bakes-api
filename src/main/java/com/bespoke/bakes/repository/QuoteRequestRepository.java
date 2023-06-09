package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.QuoteRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRequestRepository extends JpaRepository<QuoteRequest, Long> {
}
