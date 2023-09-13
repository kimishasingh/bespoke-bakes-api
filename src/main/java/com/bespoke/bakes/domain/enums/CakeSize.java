package com.bespoke.bakes.domain.enums;

public enum CakeSize {
    CM_10("10cm"),
    CM_15("15cm"),
    CM_20("20cm"),
    CM_25("25cm"),
    CM_30("30cm"),
    CM_40("40cm"),
    CM_50("50cm");

    private final String description;

    CakeSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static CakeSize valueOfCakeSize(String cakeSizeValue) {
        for (CakeSize cs : values()) {
            if (cs.description.equals(cakeSizeValue)) {
                return cs;
            }
        }
        return null;
    }
}
