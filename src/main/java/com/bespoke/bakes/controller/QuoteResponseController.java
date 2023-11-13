package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.QuoteResponse;
import com.bespoke.bakes.service.QuoteResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/quote-response")
public class QuoteResponseController {

    private final QuoteResponseService quoteResponseService;

    public QuoteResponseController(QuoteResponseService quoteResponseService) {
        this.quoteResponseService = quoteResponseService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public QuoteResponse createQuoteResponse(@RequestBody QuoteResponse quoteResponse) {
        return quoteResponseService.createQuoteResponse(quoteResponse);
    }

    @PutMapping
    public QuoteResponse updateQuoteResponse(@RequestBody QuoteResponse quoteResponse) {
        return quoteResponseService.updateQuoteResponse(quoteResponse);
    }

    @GetMapping
    public Iterable<QuoteResponse> getQuoteResponses() {
        return quoteResponseService.getAllQuoteResponses();
    }

    @GetMapping("/{id}")
    public QuoteResponse getQuoteResponseById(@PathVariable("id") Long id) {
        return quoteResponseService.findQuoteResponseById(id);
    }
}
