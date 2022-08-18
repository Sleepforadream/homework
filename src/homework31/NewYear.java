package com.homeworks.homework31;

import static com.homeworks.homework31.GiftBox.*;

public class NewYear {

    public static void main(String[] args) {

        GiftBox<Sweetness> sfd = new GiftBox<>(10);
        sfd.addElement(chocolate);
        sfd.addElement(lollipop);
        sfd.addElement(marmalade);
        sfd.addElement(3,cakes);

        System.out.println(sfd);

        System.out.println(sfd.getWeightOfGiftBoxInKg());

        sfd.sortByKilocaloriesPer100GramsOfProduct();
        System.out.println(sfd);

        System.out.println(sfd.getSweetnessAccordingToTheGivenParameters(0.1,0.5,0.1,250.0));

    }

}
