package com.arrays.homework2;

import java.util.Random;

public class BMW implements Car {
    @Override
    public String getModel() {
        Random random = new Random();
        String[] BMWModels = { "X1", "X3", "X5", "X7", "Z4", "M3", "M5", "M8" };
        int pos = random.nextInt(BMWModels.length);
        return BMWModels[pos];
    }
}
