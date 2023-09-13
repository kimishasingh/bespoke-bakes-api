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
    public QuoteRequest createQuoteRequest(@RequestBody QuoteRequest quoteRequest) {
        return quoteRequestService.createQuoteRequest(quoteRequest);
    }

    @GetMapping
    public Iterable<QuoteRequest> getQuoteRequests() {
        return quoteRequestService.getAllQuoteRequests();
    }

    @GetMapping("/{id}")
    public QuoteRequest getQuoteRequestById(@PathVariable("id") Long id) {
        return quoteRequestService.findQuoteRequestById(id);
    }
}
