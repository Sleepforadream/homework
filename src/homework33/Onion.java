package com.homeworks.homework33;

public class Onion extends Vegetables {

    public Onion(Integer calories, Integer expirationDateInDays) {
        super(calories, expirationDateInDays);
    }

    @Override
    public String toString() {
        return "Onion";
    }

    @Override
    public void growRipe() {

    }
}