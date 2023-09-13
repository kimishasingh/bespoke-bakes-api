package com.bespoke.bakes.domain.enums;

public enum IcingType {
    BUTTERCREAM("Buttercream"),
    FONDANT("Fondant"),
    FRESH_CREAM("Fresh cream"),
    CREAM_CHEESE("Cream cheese");

    private final String description;

    IcingType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static IcingType valueOfIcingType(String icingTypeValue) {
        for (IcingType it : values()) {
            if (it.description.equals(icingTypeValue)) {
                return it;
            }
        }
        return null;
    }
}
