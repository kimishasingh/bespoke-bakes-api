package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.service.QuoteRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quote-request")
public class QuoteRequestController {

    private final QuoteRequestService quoteRequestService;

    public QuoteRequestController(QuoteRequestService quoteRequestService) {
        this.quoteRequestService = quoteRequestService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public QuoteRequest createBundle(@RequestBody QuoteRequest quoteRequest) {
        return quoteRequestService.createQuoteRequest(quoteRequest);
    }

    @GetMapping
    public Iterable<QuoteRequest> getQuoteRequests() {
        return quoteRequestService.getAllQuoteRequests();
    }
}
