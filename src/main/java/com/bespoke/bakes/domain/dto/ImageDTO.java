package com.bespoke.bakes.domain.dto;

import com.bespoke.bakes.domain.enums.ImageType;

public class ImageDTO {

    private Long id;
    private String image;
    private Long matchingId;
    private ImageType imageType;

    public ImageDTO() {
    }

    public ImageDTO(Long id, String image, Long matchingId, ImageType imageType) {
        this.id = id;
        this.image = image;
        this.matchingId = matchingId;
        this.imageType = imageType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getMatchingId() {
        return matchingId;
    }

    public void setMatchingId(Long matchingId) {
        this.matchingId = matchingId;
    }

    public ImageType getImageType() {
        return imageType;
    }

    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }
}
