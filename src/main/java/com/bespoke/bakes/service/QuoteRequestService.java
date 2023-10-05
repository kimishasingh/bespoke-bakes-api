package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Bundle;
import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.request.CreateQuoteRequest;
import com.bespoke.bakes.mapper.QuoteRequestMapper;
import com.bespoke.bakes.repository.QuoteRequestRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteRequestService {

    private final QuoteRequestRepository quoteRequestRepository;
    private final BundleService bundleService;

    public QuoteRequestService(QuoteRequestRepository quoteRequestRepository,
                               BundleService bundleService) {
        this.quoteRequestRepository = quoteRequestRepository;
        this.bundleService= bundleService;
    }

    public QuoteRequest createQuoteRequest(CreateQuoteRequest createQuoteRequest) {
        Bundle bundle = bundleService.createBundle(new Bundle(createQuoteRequest.getUserId()));
        createQuoteRequest.setBundleId(bundle.getId());

        QuoteRequest quoteRequest = QuoteRequestMapper.toQuoteRequest(createQuoteRequest);
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
