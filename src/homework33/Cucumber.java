package com.homeworks.homework33;

public class Cucumber extends Vegetables {

    public Cucumber(Integer calories, Integer expirationDateInDays) {
        super(calories, expirationDateInDays);
    }

    @Override
    public String toString() {
        return "Cucumber";
    }

    @Override
    public void growRipe() {

    }
}