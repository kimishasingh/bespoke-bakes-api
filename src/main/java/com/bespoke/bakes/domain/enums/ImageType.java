package com.bespoke.bakes.domain.enums;

public enum ImageType {

    QUOTE_REQUEST("Quote request"),
    REVIEW("Review"),
    PROFILE_PICTURE("Profile Pic"),
    PORTFOLIO("Portfolio");

    private final String description;

    ImageType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ImageType valueOfImageType(String imageTypeValue) {
        for (ImageType imageType : values()) {
            if (imageType.description.equals(imageTypeValue)) {
                return imageType;
            }
        }
        return null;
    }
}
