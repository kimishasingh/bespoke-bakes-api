package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.QuoteResponse;
import com.bespoke.bakes.repository.QuoteResponseRepository;
import org.springframework.stereotype.Service;

@Service
public class QuoteResponseService {

    private QuoteResponseRepository quoteResponseRepository;

    public QuoteResponseService(QuoteResponseRepository quoteResponseRepository) {
        this.quoteResponseRepository = quoteResponseRepository;
    }

    public QuoteResponse createQuoteResponse(QuoteResponse quoteResponse) {
        return quoteResponseRepository.save(quoteResponse);
    }

    public Iterable<QuoteResponse> getAllQuoteResponses() {
        return quoteResponseRepository.findAll();
    }
}
