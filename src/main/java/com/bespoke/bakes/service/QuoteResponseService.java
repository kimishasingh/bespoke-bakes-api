package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.QuoteResponse;
import com.bespoke.bakes.repository.QuoteResponseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteResponseService {

    private final QuoteResponseRepository quoteResponseRepository;

    public QuoteResponseService(QuoteResponseRepository quoteResponseRepository) {
        this.quoteResponseRepository = quoteResponseRepository;
    }

    public QuoteResponse createQuoteResponse(QuoteResponse quoteResponse) {
        return quoteResponseRepository.save(quoteResponse);
    }

    public QuoteResponse updateQuoteResponse(QuoteResponse quoteResponse) {
        return quoteResponseRepository.save(quoteResponse);
    }

    public Iterable<QuoteResponse> getAllQuoteResponses() {
        return quoteResponseRepository.findAll();
    }

    public QuoteResponse findQuoteResponseById(Long id) {
        Optional<QuoteResponse> quoteResponse = quoteResponseRepository.findById(id);
        return quoteResponse.orElse(null);
    }
}
