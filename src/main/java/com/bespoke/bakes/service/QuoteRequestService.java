package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.repository.QuoteRequestRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteRequestService {

    private final QuoteRequestRepository quoteRequestRepository;

    public QuoteRequestService(QuoteRequestRepository quoteRequestRepository) {
        this.quoteRequestRepository = quoteRequestRepository;
    }

    public QuoteRequest createQuoteRequest(QuoteRequest quoteRequest) {
        return quoteRequestRepository.save(quoteRequest);
    }

    public Iterable<QuoteRequest> getAllQuoteRequests() {
        return quoteRequestRepository.findAll();
    }

    public QuoteRequest findQuoteRequestById(Long id) {
        Optional<QuoteRequest> quoteRequest = quoteRequestRepository.findById(id);
        return quoteRequest.orElse(null);
    }
}
