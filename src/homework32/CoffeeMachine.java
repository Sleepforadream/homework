package com.homeworks.homework32;

public class CoffeeMachine extends Electronics {

    public CoffeeMachine(Double powerConsumptionInWatt, Integer averageLoudnessInDecibels) {
        super(powerConsumptionInWatt, averageLoudnessInDecibels);
    }

    @Override
    public String toString() {
        return "CoffeeMachine";
    }

    @Override
    public void On() {

    }

    @Override
    public void Off() {

    }
}