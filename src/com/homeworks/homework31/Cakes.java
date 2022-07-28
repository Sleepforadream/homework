package com.homeworks.homework31;

public class Cakes extends Sweetness {

    public Cakes(Double weightKg, Double kilocaloriesPer100GramsOfProduct) {
        super(weightKg, kilocaloriesPer100GramsOfProduct);
    }

    @Override
    public String toString() {
        return "Cakes";
    }
}