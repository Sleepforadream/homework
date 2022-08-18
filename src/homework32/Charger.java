package com.homeworks.homework32;

public class Charger extends Electronics {

    public Charger(Double powerConsumptionInWatt, Integer averageLoudnessInDecibels) {
        super(powerConsumptionInWatt, averageLoudnessInDecibels);
    }

    @Override
    public String toString() {
        return "Charger";
    }

    @Override
    public void On() {

    }

    @Override
    public void Off() {

    }
}