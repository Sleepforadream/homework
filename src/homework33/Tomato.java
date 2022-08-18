package com.homeworks.homework33;

public class Tomato extends Vegetables {

    public Tomato(Integer calories, Integer expirationDateInDays) {
        super(calories, expirationDateInDays);
    }

    @Override
    public String toString() {
        return "Tomato";
    }

    @Override
    public void growRipe() {

    }
}