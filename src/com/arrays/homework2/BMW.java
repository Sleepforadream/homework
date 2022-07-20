package com.arrays.homework2;

public class BMW implements Car {
    private final BMWModel model;

    public BMWModel getModel() {
        return model;
    }

    public BMW(BMWModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model=" + model +
                '}';
    }

    @Override
    public void drive() {

    }
}
