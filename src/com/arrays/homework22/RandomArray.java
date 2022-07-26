package com.arrays.homework22;

import java.util.Random;

public class RandomArray {
    static Door[] getRandomDoors() {
        int low = 1;                                                         //initialization lower number in range
        int up = 7;                                                          //initialization upper number in range

        int range = (up - low);                                              //initialization range from 0 to 5

        Door[] arr = new Door[(int) (Math.random() * range) + low];          //initialization array with random length
        for (int i = 0; i < arr.length; i++) {
            int x = new Random().nextInt(2);
            if (x == 1) {
                arr[i] = createRandomSofiaDoor();
            } else {
                arr[i] = createRandomKdDoor();
            }
        }
        return arr;
    }

    public static SofiaFacing randomSofiaFacing() {
        int pick = new Random().nextInt(SofiaFacing.values().length);
        return SofiaFacing.values()[pick];
    }

    public static SofiaSize randomSofiaSize() {
        int pick = new Random().nextInt(SofiaSize.values().length);
        return SofiaSize.values()[pick];
    }

    public static SofiaModel randomSofiaModel() {
        int pick = new Random().nextInt(SofiaModel.values().length);
        return SofiaModel.values()[pick];
    }

    public static Sofia createRandomSofiaDoor() {
        SofiaFacing x = randomSofiaFacing();
        SofiaSize y = randomSofiaSize();
        SofiaModel z = randomSofiaModel();
        return new Sofia(x, z, y);
    }

    public static KdFacing randomKdFacing() {
        int pick = new Random().nextInt(KdFacing.values().length);
        return KdFacing.values()[pick];
    }

    public static KdSize randomKdSize() {
        int pick = new Random().nextInt(KdSize.values().length);
        return KdSize.values()[pick];
    }

    public static KdModel randomKdModel() {
        int pick = new Random().nextInt(KdModel.values().length);
        return KdModel.values()[pick];
    }

    public static Kd createRandomKdDoor() {
        KdFacing x = randomKdFacing();
        KdSize y = randomKdSize();
        KdModel z = randomKdModel();
        return new Kd(x, z, y);
    }
}