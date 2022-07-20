package com.arrays.homework2;

import java.util.Random;

public class AudiFactory implements CarFactory {

    public Car createCar() {
        Random random = new Random();
        Audi[] AudiModels = Audi.values();
        int pos = random.nextInt(AudiModels.length);
        return AudiModels[pos];
    }
}