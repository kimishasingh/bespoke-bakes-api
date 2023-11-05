package com.bespoke.bakes.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

@Entity(name = "image_tbl")
public class Image implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private byte[] image;
    private Long matchingId;
    private String imageType;
    @Column(name = "is_active", insertable = false)
    private boolean isActive;

    public Image() {
    }

    public Image(byte[] image, Long matchingId, String imageType, boolean isActive) {
        this.image = image;
        this.matchingId = matchingId;
        this.imageType = imageType;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getMatchingId() {
        return matchingId;
    }

    public void setMatchingId(Long matchingId) {
        this.matchingId = matchingId;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
