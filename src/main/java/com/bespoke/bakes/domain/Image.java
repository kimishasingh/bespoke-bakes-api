package com.bespoke.bakes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

@Entity(name = "image_tbl")
public class Image implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "image")
    private Blob image;
    @Column(name = "quote_request_id")
    private Long quoteRequestId;
    @Column(name = "is_active")
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
