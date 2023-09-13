package com.bespoke.bakes.domain.enums;

public enum Occasion {
    BIRTHDAY("Birthday"),
    BABY_SHOWER("Baby shower"),
    ANNIVERSARY("Anniversary"),
    BRIDAL_SHOWER("Bridal shower"),
    WEDDING("Wedding"),
    ENGAGEMENT("Engagement"),
    RETIREMENT("Retirement"),
    FAREWELL("Farewell"),
    GENDER_REVEAL("Gender reveal");

    private final String description;

    Occasion(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Occasion valueOfOccasion(String occasionValue) {
        for (Occasion e : values()) {
            if (e.description.equals(occasionValue)) {
                return e;
            }
        }
        return null;
    }
}
