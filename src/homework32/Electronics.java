package com.homeworks.homework32;

public abstract class Electronics implements ElectronicsInterface {

    private final Double powerConsumptionInWatt;

    private final Integer averageLoudnessInDecibels;

    public Double getPowerConsumptionInWatt() {
        return powerConsumptionInWatt;
    }

    public Integer getAverageLoudnessInDecibels() {
        return averageLoudnessInDecibels;
    }

    public Electronics(Double powerConsumptionInWatt, Integer averageLoudnessInDecibels) {
        this.powerConsumptionInWatt = powerConsumptionInWatt;
        this.averageLoudnessInDecibels = averageLoudnessInDecibels;
    }
}
