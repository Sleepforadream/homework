package com.homeworks.homework31;

import java.util.Arrays;

import static com.homeworks.homework31.GiftBox.*;

public class NewYear {

    public static void main(String[] args) {

        System.out.println(getWeightOfGiftBoxInKg(giftBox));

        Sweetness[] sortedGiftBox = sortByKilocaloriesPer100GramsOfProduct(giftBox);
        System.out.println(Arrays.toString(sortedGiftBox));

        String SweetnessAccordingToTheGivenParameters = getSweetnessAccordingToTheGivenParameters(giftBox,0.05,0.200,300.0, 400.0);
        System.out.println(SweetnessAccordingToTheGivenParameters);
    }

}
