package com.homeworks.homework32;

public class Tv extends Electronics {

    public Tv(Double powerConsumptionInWatt, Integer averageLoudnessInDecibels) {
        super(powerConsumptionInWatt, averageLoudnessInDecibels);
    }

    @Override
    public String toString() {
        return "Tv";
    }

    @Override
    public void On() {

    }

    @Override
    public void Off() {

    }
}