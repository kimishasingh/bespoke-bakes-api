package com.bespoke.bakes.domain.dto;

import com.bespoke.bakes.domain.Bundle;

public class QuoteResponseDTO {

    private Long id;
    private Bundle bundle;
    private Long quoteRequestId;
    private Long bundleTotal;
    private Long quoteRequestTotal;
    private Long discountAppliedPercentage;
    private boolean quoteAccepted;
    private UserDTO baker;
    private boolean isActive;

    public QuoteResponseDTO() {
    }

    public QuoteResponseDTO(Bundle bundle, Long quoteRequestId, Long bundleTotal, Long quoteRequestTotal, Long discountAppliedPercentage, boolean quoteAccepted, UserDTO baker, boolean isActive) {
        this.bundle = bundle;
        this.quoteRequestId = quoteRequestId;
        this.bundleTotal = bundleTotal;
        this.quoteRequestTotal = quoteRequestTotal;
        this.discountAppliedPercentage = discountAppliedPercentage;
        this.quoteAccepted = quoteAccepted;
        this.baker = baker;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public Long getQuoteRequestId() {
        return quoteRequestId;
    }

    public void setQuoteRequestId(Long quoteRequestId) {
        this.quoteRequestId = quoteRequestId;
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

    public UserDTO getBaker() {
        return baker;
    }

    public void setBaker(UserDTO baker) {
        this.baker = baker;
    }
}
