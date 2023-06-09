package com.bespoke.bakes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Blob;

@Entity(name = "Image_Tbl")
public class Image implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "Image")
    private Blob image;
    @Column(name = "QuoteRequestId")
    private Long quoteRequestId;
    @Column(name = "IsActive")
    private boolean isActive;

    public Image() {
    }

    public Image(Blob image, Long quoteRequestId, boolean isActive) {
        this.image = image;
        this.quoteRequestId = quoteRequestId;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Long getQuoteRequestId() {
        return quoteRequestId;
    }

    public void setQuoteRequestId(Long quoteRequestId) {
        this.quoteRequestId = quoteRequestId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
