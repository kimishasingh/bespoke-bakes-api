package com.bespoke.bakes.domain.request;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.QuoteResponse;

public class AcceptedQuoteRequest {

    QuoteRequest quoteRequest;
    QuoteResponse quoteResponse;

    public AcceptedQuoteRequest() {
    }

    public AcceptedQuoteRequest(QuoteRequest quoteRequest, QuoteResponse quoteResponse) {
        this.quoteRequest = quoteRequest;
        this.quoteResponse = quoteResponse;
    }

    public QuoteRequest getQuoteRequest() {
        return quoteRequest;
    }

    public void setQuoteRequest(QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    public QuoteResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuoteResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }
}
