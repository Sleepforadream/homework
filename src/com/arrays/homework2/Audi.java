package com.arrays.homework2;

public class Audi implements Car {
    private final AudiModel model;

    public Audi(AudiModel model) {
        this.model = model;
    }

    public AudiModel getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model=" + model +
                '}';
    }

    @Override
    public void drive() {

    }
}
