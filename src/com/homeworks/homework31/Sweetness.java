package com.homeworks.homework31;

public abstract class Sweetness implements SweetnessInterface {

    private final Double weightKg;

    private final Double kilocaloriesPer100GramsOfProduct;

    public Double getWeightKg() {
        return weightKg;
    }

    public Double getKilocaloriesPer100GramsOfProduct() {
        return kilocaloriesPer100GramsOfProduct;
    }

    public Sweetness(Double weightKg, Double kilocaloriesPer100GramsOfProduct) {
        this.weightKg = weightKg;
        this.kilocaloriesPer100GramsOfProduct = kilocaloriesPer100GramsOfProduct;
    }
}