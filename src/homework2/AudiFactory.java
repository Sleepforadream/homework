package com.homeworks.homework2;

public class AudiFactory implements CarFactory {

    @Override
    public Car createCar(Model model) {
        return new Audi((AudiModel) model);
    }
}