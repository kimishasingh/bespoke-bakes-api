package com.bespoke.bakes.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "quote_response_tbl")
public class QuoteResponse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bundle_id")
    private Long bundleId;
    @Column(name = "quote_request_id")
    private Long quoteRequestId;
    @Column(name = "bundle_total")
    private Long bundleTotal;
    @Column(name = "quote_request_total")
    private Long quoteRequestTotal;
    @Column(name = "discount_applied_percentage")
    private Long discountAppliedPercentage;
    @Column(name = "quote_accepted")
    private boolean quoteAccepted;
    @Column(name = "is_active")
    private boolean isActive;

    public QuoteResponse() {
    }

    public QuoteResponse(Long bundleId, Long quoteRequestId, Long bundleTotal, Long quoteRequestTotal, Long discountAppliedPercentage, boolean quoteAccepted, boolean isActive) {
        this.bundleId = bundleId;
        this.quoteRequestId = quoteRequestId;
        this.bundleTotal = bundleTotal;
        this.quoteRequestTotal = quoteRequestTotal;
        this.discountAppliedPercentage = discountAppliedPercentage;
        this.quoteAccepted = quoteAccepted;
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
}
