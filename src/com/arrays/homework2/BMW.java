package com.arrays.homework2;

public enum BMW implements Car {
    BMW_X1,
    BMW_X3,
    BMW_X5,
    BMW_X7,
    BMW_Z4,
    BMW_M3,
    BMW_M5,
    BMW_M8;

    public void drive() {
        System.out.println("Drive BMW");
    }
}