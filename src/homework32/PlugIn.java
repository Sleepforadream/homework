package com.homeworks.homework32;

import java.util.Arrays;

public class PlugIn<T extends Electronics> {

    private static final int DEFAULT_CAPACITY = 10;

    protected Electronics[] arrayDevices;

    public PlugIn() {
        this.arrayDevices = new Electronics[DEFAULT_CAPACITY];
    }

    public PlugIn(int capacity) {
        this.arrayDevices = new Electronics[capacity];
    }

    public PlugIn(Electronics... electronics) {
        this.arrayDevices = new Electronics[electronics.length];
        for (int i = 0; i < electronics.length; i++) {
            arrayDevices[i] = electronics[i];
        }
    }

    @Override
    public String toString() {
        int count = 0;
        for (int i = 0; i < arrayDevices.length; i++) {
            if (arrayDevices[i] == null) {
                count++;
            }
        }
        if (count == arrayDevices.length) {
            return "[]";
        } else {
            Electronics[] arrayElectronicsTemp = new Electronics[getLength()];
            for (int i = 0; i < arrayElectronicsTemp.length; i++) {
                arrayElectronicsTemp[i] = arrayDevices[i];
            }
            arrayDevices = arrayElectronicsTemp;
            return Arrays.toString(arrayDevices);
        }
    }

    public void addElement(Electronics electronics) {
        boolean isAdd = false;
        for (int i = 0; i < arrayDevices.length; i++) {
            if (arrayDevices[i] == null) {
                arrayDevices[i] = electronics;
                isAdd = true;
                break;
            }
        }
        if (!isAdd) {
            Electronics[] arrayElectronicsTemp = new Electronics[arrayDevices.length + 1];
            System.arraycopy(arrayDevices, 0, arrayElectronicsTemp, 0, arrayDevices.length);
            arrayDevices = arrayElectronicsTemp;
            arrayDevices[arrayDevices.length - 1] = electronics;
        }
    }

    public void addElement(int index, Electronics electronics) {
        if (index != 0 && arrayDevices[index - 1] == null) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getLength());
        }
        Electronics[] arrayElectronicsTemp = new Electronics[arrayDevices.length + 1];
        System.arraycopy(arrayDevices, 0, arrayElectronicsTemp, 0, arrayDevices.length);
        arrayElectronicsTemp[index] = electronics;
        for (int i = index + 1; i < arrayDevices.length; i++) {
            arrayElectronicsTemp[i] = arrayDevices[i - 1];
        }
        arrayDevices = arrayElectronicsTemp;
    }

    static Charger charger = new Charger(0.005, 1);
    static Tv tv = new Tv(0.300, 60);
    static Computer computer = new Computer(0.500, 40);
    static Hoover hoover = new Hoover(1.300, 75);
    static CoffeeMachine coffeeMachine = new CoffeeMachine(0.900, 50);


    public Double getPowerConsumptionDevices() {
        Double allConsumption = 0.0;
        for (int i = 0; i < getLength(); i++) {
            allConsumption = arrayDevices[i].getPowerConsumptionInWatt() + allConsumption;
        }
        return allConsumption;
    }

    public void swap(Electronics[] array, int ind1, int ind2) {
        Electronics tmp = arrayDevices[ind1];
        arrayDevices[ind1] = arrayDevices[ind2];
        arrayDevices[ind2] = tmp;
    }

    public void sortByLoudness() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arrayDevices.length; i++) {
                if (arrayDevices[i].getAverageLoudnessInDecibels() < arrayDevices[i - 1].getAverageLoudnessInDecibels()) {
                    swap(arrayDevices, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public String getDevicesAccordingToTheGivenParameters(Double minConsumption, Double
            maxConsumption, Integer minLoudness, Integer maxLoudness) {
        String result = "";
        for (int i = 0; i < getLength(); i++) {
            if (arrayDevices[i].getPowerConsumptionInWatt() >= minConsumption && arrayDevices[i].getPowerConsumptionInWatt() <= maxConsumption) {
                if (arrayDevices[i].getAverageLoudnessInDecibels() >= minLoudness && arrayDevices[i].getAverageLoudnessInDecibels() <= maxLoudness) {
                    result = arrayDevices[i] + " " + result;
                }
            }
        }
        return result;
    }

    public int getLength() {
        int count = 0;
        for (int i = 0; i < arrayDevices.length; i++) {
            if (arrayDevices[i] != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public Electronics getElementByIndex(int index) {
        return arrayDevices[index];
    }
}