package com.homeworks.homework31;

public class Chocolate extends Sweetness{

    public Chocolate(Double weightKg, Double kilocaloriesPer100GramsOfProduct) {
        super(weightKg, kilocaloriesPer100GramsOfProduct);
    }

    @Override
    public String toString() {
        return "Chocolate";
    }
}