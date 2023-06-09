package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.QuoteResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteResponseRepository extends JpaRepository<QuoteResponse, Long> {
}
