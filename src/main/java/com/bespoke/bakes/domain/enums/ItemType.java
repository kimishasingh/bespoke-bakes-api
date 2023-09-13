package com.bespoke.bakes.domain.enums;

public enum ItemType {
    CAKES("Cakes"),
    CUPCAKES("Cupcakes"),
    CAKE_POPS("Cake pops");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ItemType valueOfItemType(String itemTypeValue) {
        for (ItemType it : values()) {
            if (it.description.equals(itemTypeValue)) {
                return it;
            }
        }
        return null;
    }
}
