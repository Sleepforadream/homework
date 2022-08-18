package com.homeworks.homework32;

public class Computer extends Electronics {

    public Computer(Double powerConsumptionInWatt, Integer averageLoudnessInDecibels) {
        super(powerConsumptionInWatt, averageLoudnessInDecibels);
    }

    @Override
    public String toString() {
        return "Computer";
    }

    @Override
    public void On() {

    }

    @Override
    public void Off() {

    }
}