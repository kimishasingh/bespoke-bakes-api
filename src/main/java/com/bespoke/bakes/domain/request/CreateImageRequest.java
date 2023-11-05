package com.bespoke.bakes.domain.request;

import com.bespoke.bakes.domain.enums.ImageType;

public class CreateImageRequest {

    private String image;
    private Long matchingId;
    private ImageType imageType;

    public CreateImageRequest() {
    }

    public CreateImageRequest(String image, Long matchingId, ImageType imageType) {
        this.image = image;
        this.matchingId = matchingId;
        this.imageType = imageType;
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
