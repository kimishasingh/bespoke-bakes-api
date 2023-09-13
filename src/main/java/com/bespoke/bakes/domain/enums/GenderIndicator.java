package com.bespoke.bakes.domain.enums;

public enum GenderIndicator {
    BOY("Boy"),
    GIRL("Girl");

    private final String description;

    GenderIndicator(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static GenderIndicator valueOfGenderIndicator(String genderIndicatorValue) {
        for (GenderIndicator gi : values()) {
            if (gi.description.equals(genderIndicatorValue)) {
                return gi;
            }
        }
        return null;
    }
}
