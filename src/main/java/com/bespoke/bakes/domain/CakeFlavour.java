package com.bespoke.bakes.domain;

public enum CakeFlavour {
    CHOCOLATE("Chocolate"),
    VANILLA("Vanilla"),
    RED_VELVET("Red Velvet"),
    CARROT("Carrot"),
    BANANA("Banana"),
    COFFEE("Coffee"),
    LEMON("Lemon"),
    CHEESECAKE("Cheesecake");

    private final String description;

    CakeFlavour(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static CakeFlavour valueOfCakeFlavour(String cakeFlavourValue) {
        for (CakeFlavour cf : values()) {
            if (cf.description.equals(cakeFlavourValue)) {
                return cf;
            }
        }
        return null;
    }
}
