package com.arrays.homework2;

import java.util.Random;

public class BMWFactory implements CarFactory {

    public Car createCar() {
        Random random = new Random();
        BMW[] BMWModels = BMW.values();
        int pos = random.nextInt(BMWModels.length);
        return BMWModels[pos];
    }
}