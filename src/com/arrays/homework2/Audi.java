package com.arrays.homework2;

import java.util.Random;

public class Audi implements Car {

    @Override
    public String getModel() {
        Random random = new Random();
        String[] AudiModels = { "A3", "A4", "A6", "Q5", "Q3", "Q7", "A5", "A8" };
        int pos = random.nextInt(AudiModels.length);
        return AudiModels[pos];
    }
}