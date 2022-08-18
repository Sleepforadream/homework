package com.homeworks.homework32;

import static com.homeworks.homework32.PlugIn.*;

public class HomeDevices {

    public static void main(String[] args) {

        PlugIn<Electronics> sfd = new PlugIn<>(10);
        sfd.addElement(tv);
        sfd.addElement(charger);
        sfd.addElement(hoover);
        sfd.addElement(1, coffeeMachine);

        System.out.println(sfd);

        System.out.println(sfd.getPowerConsumptionDevices());

        sfd.sortByLoudness();
        System.out.println(sfd);

        System.out.println(sfd.getDevicesAccordingToTheGivenParameters(0.001, 1.500, 1, 250));

    }

}
