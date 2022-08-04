package com.homeworks.homework33;

public class Pepper extends Vegetables {

    public Pepper(Integer calories, Integer expirationDateInDays) {
        super(calories, expirationDateInDays);
    }

    @Override
    public String toString() {
        return "Pepper";
    }

    @Override
    public void growRipe() {

    }
}