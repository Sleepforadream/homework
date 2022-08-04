package com.homeworks.homework33;

import java.util.Arrays;

public class Salad<T extends Vegetables> {

    private static final int DEFAULT_CAPACITY = 10;

    protected Vegetables[] arraySalad;

    public Salad() {
        this.arraySalad = new Vegetables[DEFAULT_CAPACITY];
    }

    public Salad(int capacity) {
        this.arraySalad = new Vegetables[capacity];
    }

    public Salad(Vegetables... vegetables) {
        this.arraySalad = new Vegetables[vegetables.length];
        for (int i = 0; i < vegetables.length; i++) {
            arraySalad[i] = vegetables[i];
        }
    }

    @Override
    public String toString() {
        int count = 0;
        for (int i = 0; i < arraySalad.length; i++) {
            if (arraySalad[i] == null) {
                count++;
            }
        }
        if (count == arraySalad.length) {
            return "[]";
        } else {
            Vegetables[] arrayVegetablesTemp = new Vegetables[getLength()];
            for (int i = 0; i < arrayVegetablesTemp.length; i++) {
                arrayVegetablesTemp[i] = arraySalad[i];
            }
            arraySalad = arrayVegetablesTemp;
            return Arrays.toString(arraySalad);
        }
    }

    public void addElement(Vegetables vegetables) {
        boolean isAdd = false;
        for (int i = 0; i < arraySalad.length; i++) {
            if (arraySalad[i] == null) {
                arraySalad[i] = vegetables;
                isAdd = true;
                break;
            }
        }
        if (!isAdd) {
            Vegetables[] arrayVegetablesTemp = new Vegetables[arraySalad.length + 1];
            System.arraycopy(arraySalad, 0, arrayVegetablesTemp, 0, arraySalad.length);
            arraySalad = arrayVegetablesTemp;
            arraySalad[arraySalad.length - 1] = vegetables;
        }
    }

    public void addElement(int index, Vegetables vegetables) {
        if (index != 0 && arraySalad[index - 1] == null) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getLength());
        }
        Vegetables[] arrayVegetablesTemp = new Vegetables[arraySalad.length + 1];
        System.arraycopy(arraySalad, 0, arrayVegetablesTemp, 0, arraySalad.length);
        arrayVegetablesTemp[index] = vegetables;
        for (int i = index + 1; i < arraySalad.length; i++) {
            arrayVegetablesTemp[i] = arraySalad[i - 1];
        }
        arraySalad = arrayVegetablesTemp;
    }

    static Cucumber cucumber = new Cucumber(16, 6);
    static Potato potato = new Potato(77, 150);
    static Pepper pepper = new Pepper(40, 90);
    static Onion onion = new Onion(41, 180);
    static Tomato tomato = new Tomato(20, 12);

    public Double getCalories() {
        Double allCalories = 0.0;
        for (int i = 0; i < getLength(); i++) {
            allCalories = arraySalad[i].getCalories() + allCalories;
        }
        return allCalories;
    }

    public void swap(Vegetables[] array, int ind1, int ind2) {
        Vegetables tmp = arraySalad[ind1];
        arraySalad[ind1] = arraySalad[ind2];
        arraySalad[ind2] = tmp;
    }

    public void sortByExpirationDateInDays() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arraySalad.length; i++) {
                if (arraySalad[i].getExpirationDateInDays() < arraySalad[i - 1].getExpirationDateInDays()) {
                    swap(arraySalad, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public String getVegetablesAccordingToTheGivenParameters(Integer minCalories, Integer
            maxCalories, Integer minExpirationDateInDays, Integer maxExpirationDateInDays) {
        String result = "";
        for (int i = 0; i < getLength(); i++) {
            if (arraySalad[i].getCalories() >= minCalories && arraySalad[i].getCalories() <= maxCalories) {
                if (arraySalad[i].getExpirationDateInDays() >= minExpirationDateInDays && arraySalad[i].getExpirationDateInDays() <= maxExpirationDateInDays) {
                    result = arraySalad[i] + " " + result;
                }
            }
        }
        return result;
    }

    public int getLength() {
        int count = 0;
        for (int i = 0; i < arraySalad.length; i++) {
            if (arraySalad[i] != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public Vegetables getElementByIndex(int index) {
        return arraySalad[index];
    }
}