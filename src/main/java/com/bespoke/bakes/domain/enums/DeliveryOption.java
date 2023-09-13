package com.bespoke.bakes.domain.enums;

public enum DeliveryOption {
    DELIVER("Deliver"),
    COLLECT("Collect");

    private final String description;

    DeliveryOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static DeliveryOption valueOfDeliveryOption(String deliveryOptionValue) {
        for (DeliveryOption d : values()) {
            if (d.description.equals(deliveryOptionValue)) {
                return d;
            }
        }
        return null;
    }
}
