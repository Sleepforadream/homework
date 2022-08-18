package com.homeworks.homework2;

public class BMWFactory implements CarFactory {

    @Override
    public Car createCar(Model model) {
        return new BMW((BMWModel) model);
    }
}