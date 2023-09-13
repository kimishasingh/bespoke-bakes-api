package com.bespoke.bakes.domain.enums;

public enum Budget {
    UNDER_R250("Under R250"),
    R251_R500("R251 - R500"),
    R501_R750("R501 - R750"),
    R751_R1000("R751 - R1000"),
    R1001_R1500("R1001 - R1500"),
    R1501_R2500("R1501 - R2500"),
    OVER_R2500("Over R2500");

    private final String description;

    Budget(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Budget valueOfBudget(String budgetValue) {
        for (Budget b : values()) {
            if (b.description.equals(budgetValue)) {
                return b;
            }
        }
        return null;
    }
}
