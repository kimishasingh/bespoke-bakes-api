package com.bespoke.bakes.domain.dto;

import com.bespoke.bakes.domain.QuoteRequest;

public class QuoteResponseWithQuoteRequest {

    private Long id;

    private Long bundleId;

    private QuoteRequest quoteRequest;

    private Long bundleTotal;

    private Long quoteRequestTotal;

    private Long discountAppliedPercentage;

    private boolean quoteAccepted;

    private Long userId;

    private boolean isActive;

    public QuoteResponseWithQuoteRequest() {
    }

    public QuoteResponseWithQuoteRequest(Long bundleId, QuoteRequest quoteRequest, Long bundleTotal, Long quoteRequestTotal, Long discountAppliedPercentage, boolean quoteAccepted, Long userId, boolean isActive) {
        this.bundleId = bundleId;
        this.quoteRequest = quoteRequest;
        this.bundleTotal = bundleTotal;
        this.quoteRequestTotal = quoteRequestTotal;
        this.discountAppliedPercentage = discountAppliedPercentage;
        this.quoteAccepted = quoteAccepted;
        this.userId = userId;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public QuoteRequest getQuoteRequest() {
        return quoteRequest;
    }

    public void setQuoteRequest(QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    public Long getBundleTotal() {
        return bundleTotal;
    }

    public void setBundleTotal(Long bundleTotal) {
        this.bundleTotal = bundleTotal;
    }

    public Long getQuoteRequestTotal() {
        return quoteRequestTotal;
    }

    public void setQuoteRequestTotal(Long quoteRequestTotal) {
        this.quoteRequestTotal = quoteRequestTotal;
    }

    public Long getDiscountAppliedPercentage() {
        return discountAppliedPercentage;
    }

    public void setDiscountAppliedPercentage(Long discountAppliedPercentage) {
        this.discountAppliedPercentage = discountAppliedPercentage;
    }

    public boolean isQuoteAccepted() {
        return quoteAccepted;
    }

    public void setQuoteAccepted(boolean quoteAccepted) {
        this.quoteAccepted = quoteAccepted;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
