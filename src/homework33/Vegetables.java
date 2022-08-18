package com.homeworks.homework33;

public abstract class Vegetables implements VegetablesInterface {

    private final Integer calories;

    private final Integer expirationDateInDays;

    public Integer getCalories() {
        return calories;
    }

    public Integer getExpirationDateInDays() {
        return expirationDateInDays;
    }

    public Vegetables(Integer calories, Integer expirationDateInDays) {
        this.calories = calories;
        this.expirationDateInDays = expirationDateInDays;
    }
}
