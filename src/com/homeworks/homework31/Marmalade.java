package com.homeworks.homework31;

public class Marmalade extends Sweetness {

    public Marmalade(Double weightKg, Double kilocaloriesPer100GramsOfProduct) {
        super(weightKg, kilocaloriesPer100GramsOfProduct);
    }

    @Override
    public String toString() {
        return "Marmalade";
    }
}