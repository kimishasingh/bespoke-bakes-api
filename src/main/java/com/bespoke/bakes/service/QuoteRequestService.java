package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Bundle;
import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.QuoteResponse;
import com.bespoke.bakes.domain.request.AcceptedQuoteRequest;
import com.bespoke.bakes.domain.request.CreateQuoteRequest;
import com.bespoke.bakes.domain.request.QuoteRequestDTO;
import com.bespoke.bakes.mapper.QuoteRequestMapper;
import com.bespoke.bakes.repository.QuoteRequestRepository;
import com.bespoke.bakes.repository.QuoteResponseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuoteRequestService {

    private final QuoteRequestRepository quoteRequestRepository;
    private final QuoteResponseRepository quoteResponseRepository;
    private final BundleService bundleService;

    public QuoteRequestService(QuoteRequestRepository quoteRequestRepository,
                               QuoteResponseRepository quoteResponseRepository,
                               BundleService bundleService) {
        this.quoteRequestRepository = quoteRequestRepository;
        this.quoteResponseRepository = quoteResponseRepository;
        this.bundleService = bundleService;
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

    public List<AcceptedQuoteRequest> findAcceptedQuoteRequestsByUserId(Long userId) {
        List<AcceptedQuoteRequest> acceptedQuoteRequests = new ArrayList<>();

        List<QuoteRequest> allQuoteRequests = quoteRequestRepository.findByUserId(userId);
        allQuoteRequests.forEach(quoteRequest -> {
            Optional<QuoteResponse> acceptedQuoteResponse = quoteResponseRepository.findAcceptedQuoteResponse(quoteRequest.getId());
            if (acceptedQuoteResponse.isPresent()) {
                AcceptedQuoteRequest acceptedQuoteRequest = new AcceptedQuoteRequest(quoteRequest, acceptedQuoteResponse.get());
                acceptedQuoteRequests.add(acceptedQuoteRequest);
            }
        });
        return acceptedQuoteRequests;
    }

    public List<QuoteRequestDTO> findAllQuoteRequestsByUserId(Long userId) {
        List<QuoteRequestDTO> allQuoteRequestsDTO = new ArrayList<>();

        List<QuoteRequest> allQuoteRequests = quoteRequestRepository.findByUserId(userId);
        allQuoteRequests.forEach(quoteRequest -> {
            List<QuoteResponse> quoteResponses = quoteResponseRepository.findByQuoteRequestId(quoteRequest.getId());
            allQuoteRequestsDTO.add(QuoteRequestMapper.toQuoteRequestDTO(quoteRequest, userId, quoteResponses));
        });
        return allQuoteRequestsDTO;
    }
}
