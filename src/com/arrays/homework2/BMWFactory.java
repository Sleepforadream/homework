package com.arrays.homework2;

import java.util.Random;

public class BMWFactory implements CarFactory {

    @Override
    public Car createCar(Model model) {
        return new BMW((BMWModel) model);
    }
}