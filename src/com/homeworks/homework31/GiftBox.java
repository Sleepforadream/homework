package com.homeworks.homework31;

import java.util.Arrays;

public class GiftBox<T extends Sweetness> {

    private static final int DEFAULT_CAPACITY = 10;

    protected Sweetness [] arrayGift;

    public GiftBox() {
        this.arrayGift = new Sweetness [DEFAULT_CAPACITY];
    }

    public GiftBox(int capacity) {
        this.arrayGift = new Sweetness [capacity];
    }

    public GiftBox(Sweetness... sweetness) {
        this.arrayGift = new Sweetness[sweetness.length];
        for (int i = 0; i < sweetness.length; i++) {
            arrayGift[i] = sweetness[i];
        }
    }

    @Override
    public String toString() {
        int count = 0;
        for (int i = 0; i < arrayGift.length; i++) {
            if (arrayGift[i] == null) {
                count++;
            }
        }
        if (count == arrayGift.length) {
            return "[]";
        } else {
            Sweetness [] arrayGiftTemp = new Sweetness[getLength()];
            for (int i = 0; i < arrayGiftTemp.length; i++){
                    arrayGiftTemp [i] = arrayGift [i];
                }
            arrayGift = arrayGiftTemp;
            return Arrays.toString(arrayGift);
        }
    }

    public void addElement(Sweetness sweetness) {
        boolean isAdd = false;
        for (int i = 0; i < arrayGift.length; i++) {
            if (arrayGift[i] == null){
                arrayGift[i] = sweetness;
                isAdd = true;
                break;
            }
        }
        if (!isAdd){
            Sweetness [] arrayGiftTemp = new Sweetness[arrayGift.length + 1];
            System.arraycopy(arrayGift, 0, arrayGiftTemp, 0, arrayGift.length);
            arrayGift = arrayGiftTemp;
            arrayGift [arrayGift.length - 1] = sweetness;
        }
    }

    public void addElement(int index, Sweetness sweetness) {
        if (index != 0 && arrayGift[index - 1] == null) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getLength());
        }
        Sweetness [] arrayGiftTemp = new Sweetness[arrayGift.length + 1];
        System.arraycopy(arrayGift, 0, arrayGiftTemp, 0, arrayGift.length);
        arrayGiftTemp[index] = sweetness;
        for (int i = index + 1; i < arrayGift.length; i++){
            arrayGiftTemp[i] = arrayGift[i - 1];
        }
        arrayGift = arrayGiftTemp;
    }

    static Cakes cakes = new Cakes(0.13, 215.0);
    static Chocolate chocolate = new Chocolate(0.23, 250.0);
    static Lollipop lollipop = new Lollipop(0.2, 102.0);
    static Marshmallow marshmallow = new Marshmallow(0.34, 312.0);
    static Marmalade marmalade = new Marmalade(0.47, 367.0);


    public Double getWeightOfGiftBoxInKg() {
        Double allWeight = 0.0;
        for (int i = 0; i < getLength(); i++){
            allWeight = arrayGift[i].weightKg + allWeight;
        }
        return allWeight;
    }

    public void swap(Sweetness[] array, int ind1, int ind2) {
        Sweetness tmp = arrayGift[ind1];
        arrayGift[ind1] = arrayGift[ind2];
        arrayGift[ind2] = tmp;
    }

    public void sortByKilocaloriesPer100GramsOfProduct() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arrayGift.length; i++) {
                if (arrayGift[i].kilocaloriesPer100GramsOfProduct < arrayGift[i - 1].kilocaloriesPer100GramsOfProduct) {
                    swap(arrayGift, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public String getSweetnessAccordingToTheGivenParameters(Double minWeight, Double
            maxWeight, Double minCalories, Double maxCalories) {
        String result = "";
        for (int i = 0; i < getLength(); i++) {
            if (arrayGift[i].weightKg >= minWeight && arrayGift[i].weightKg <= maxWeight) {
                if (arrayGift[i].kilocaloriesPer100GramsOfProduct >= minCalories && arrayGift[i].kilocaloriesPer100GramsOfProduct <= maxCalories) {
                    result = arrayGift[i] + " " + result;
                }
            }
        }
        return result;
    }

    public int getLength () {
        int count = 0;
        for (int i = 0; i < arrayGift.length; i++) {
            if (arrayGift[i] != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public Sweetness getElementByIndex (int index) {
        return arrayGift[index];
    }
}