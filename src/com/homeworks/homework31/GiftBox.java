package com.homeworks.homework31;

public class GiftBox {

    public static Chocolate getChocolate() {
        return chocolate;
    }

    public static Cakes getCakes() {
        return cakes;
    }

    public static Lollipop getLollipop() {
        return lollipop;
    }

    public static Marmalade getMarmalade() {
        return marmalade;
    }

    public static Marshmallow getMarshmallow() {
        return marshmallow;
    }

    public static Sweetness[] getGiftBox() {
        return giftBox;
    }

    protected static Chocolate chocolate = new Chocolate(0.250, 403.00);
    protected static Cakes cakes = new Cakes(0.130, 322.0);
    protected static Lollipop lollipop = new Lollipop(0.085, 320.00);
    protected static Marmalade marmalade = new Marmalade(0.050, 295.00);
    protected static Marshmallow marshmallow = new Marshmallow(0.025, 436.00);

    protected static Sweetness[] giftBox = new Sweetness[]{chocolate, cakes, lollipop, marmalade, marshmallow};

    public static Double getWeightOfGiftBoxInKg(Sweetness[] giftBox) {
        Double allWeight = 0.0;
        for (Sweetness box : giftBox) {
            allWeight = box.weightKg + allWeight;
        }
        return allWeight;
    }

    public static void swap(Sweetness[] array, int ind1, int ind2) {
        Sweetness tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static Sweetness[] sortByKilocaloriesPer100GramsOfProduct(Sweetness[] giftBox) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < giftBox.length; i++) {
                if (giftBox[i].kilocaloriesPer100GramsOfProduct < giftBox[i - 1].kilocaloriesPer100GramsOfProduct) {
                    swap(giftBox, i, i - 1);
                    needIteration = true;
                }
            }
        }
        return giftBox;
    }

    public static String getSweetnessAccordingToTheGivenParameters(Sweetness[] giftBox, Double minWeight, Double maxWeight, Double minCalories, Double maxCalories) {
        String result = "";
        for (int i = 1; i < giftBox.length; i++) {
            if (giftBox[i].weightKg >= minWeight && giftBox[i].weightKg <= maxWeight) {
                if (giftBox[i].kilocaloriesPer100GramsOfProduct >= minCalories && giftBox[i].kilocaloriesPer100GramsOfProduct <= maxCalories) {
                    result = giftBox[i] + " " + result;
                }
            }
        }
        return result;
    }
}