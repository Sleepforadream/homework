package com.homeworks.homework33;

import static com.homeworks.homework33.Salad.*;

public class ChiefCooker {

    public static void main(String[] args) {

        Salad<Vegetables> sfd = new Salad<>(10);
        sfd.addElement(onion);
        sfd.addElement(potato);
        sfd.addElement(pepper);
        sfd.addElement(2, tomato);

        System.out.println(sfd);

        System.out.println(sfd.getCalories());

        sfd.sortByExpirationDateInDays();
        System.out.println(sfd);

        System.out.println(sfd.getVegetablesAccordingToTheGivenParameters(1, 100, 1, 100));

    }
}
