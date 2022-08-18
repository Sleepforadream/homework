package com.homeworks.homework33;

public class Potato extends Vegetables {

    public Potato(Integer calories, Integer expirationDateInDays) {
        super(calories, expirationDateInDays);
    }

    @Override
    public String toString() {
        return "Potato";
    }

    @Override
    public void growRipe() {

    }
}