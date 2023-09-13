package com.bespoke.bakes.domain.enums;

public enum IcingFlavour {
    CREAM_CHEESE("Cream cheese"),
    CHOCOLATE("Chocolate"),
    VANILLA("Vanilla"),
    CARAMEL("Caramel"),
    BUBBLEGUM("Bubblegum"),
    STRAWBERRY("Strawberry"),
    LEMON("Lemon"),
    NUTELLA("Nutella");

    private final String description;

    IcingFlavour(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static IcingFlavour valueOfIcingFlavour(String icingFlavourValue) {
        for (IcingFlavour i : values()) {
            if (i.description.equals(icingFlavourValue)) {
                return i;
            }
        }
        return null;
    }
}
