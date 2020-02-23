package com.brunoyam.Calendar;

public enum Season {
    WINTER("зима"),
    SPRING("весна"),
    SUMMER("лето"),
    AUTUMN("осень");

    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
