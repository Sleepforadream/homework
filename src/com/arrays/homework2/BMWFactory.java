package com.arrays.homework2;

public class BMWFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new BMW();
    }
}
