package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.QuoteResponse;
import com.bespoke.bakes.domain.dto.QuoteResponseWithQuoteRequest;
import com.bespoke.bakes.repository.QuoteRequestRepository;
import com.bespoke.bakes.repository.QuoteResponseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuoteResponseService {

    private final QuoteResponseRepository quoteResponseRepository;
    private final QuoteRequestRepository quoteRequestRepository;

    public QuoteResponseService(QuoteResponseRepository quoteResponseRepository,
                                QuoteRequestRepository quoteRequestRepository) {
        this.quoteResponseRepository = quoteResponseRepository;
        this.quoteRequestRepository = quoteRequestRepository;
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

    public List<QuoteResponseWithQuoteRequest> getAllQuoteResponsesWithQuoteRequest() {
        List<QuoteResponseWithQuoteRequest> quoteResponseWithQuoteRequests = new ArrayList<>();
        List<QuoteResponse> quoteResponses = quoteResponseRepository.findAll();

        for (QuoteResponse quoteResponse : quoteResponses) {
            QuoteRequest quoteRequest = quoteRequestRepository.findById(quoteResponse.getQuoteRequestId()).orElse(null);
            QuoteResponseWithQuoteRequest quoteResponseWithQuoteRequest = new QuoteResponseWithQuoteRequest();
            BeanUtils.copyProperties(quoteResponse, quoteResponseWithQuoteRequest);
            quoteResponseWithQuoteRequest.setQuoteRequest(quoteRequest);
            quoteResponseWithQuoteRequests.add(quoteResponseWithQuoteRequest);
        }

        return quoteResponseWithQuoteRequests;
    }

    public QuoteResponse findQuoteResponseById(Long id) {
        Optional<QuoteResponse> quoteResponse = quoteResponseRepository.findById(id);
        return quoteResponse.orElse(null);
    }
}
