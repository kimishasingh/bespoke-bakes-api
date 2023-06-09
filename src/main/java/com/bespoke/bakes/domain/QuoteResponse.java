package com.bespoke.bakes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "Quote_Response_Tbl")
public class QuoteResponse implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "BundleId")
    private Long bundleId;
    @Column(name = "QuoteRequestId")
    private Long quoteRequestId;
    @Column(name = "BundleTotal")
    private Long bundleTotal;
    @Column(name = "QuoteRequestTotal")
    private Long quoteRequestTotal;
    @Column(name = "DiscountAppliedPercentage")
    private Long discountAppliedPercentage;
    @Column(name = "QuoteAccepted")
    private boolean quoteAccepted;
    @Column(name = "IsActive")
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
