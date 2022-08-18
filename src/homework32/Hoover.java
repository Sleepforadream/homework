package com.homeworks.homework32;

public class Hoover extends Electronics {

    public Hoover(Double powerConsumptionInWatt, Integer averageLoudnessInDecibels) {
        super(powerConsumptionInWatt, averageLoudnessInDecibels);
    }

    @Override
    public String toString() {
        return "Hoover";
    }

    @Override
    public void On() {

    }

    @Override
    public void Off() {

    }
}