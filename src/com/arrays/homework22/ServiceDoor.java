package com.arrays.homework22;

import java.util.Arrays;

import static com.arrays.homework22.RandomArray.*;
import static com.arrays.homework22.RandomArray.randomKdDoors;

public class ServiceDoor {
    public static void getArraysWithSameTypes() {
        Door[] randomDoors = getRandomDoors();
        System.out.println(Arrays.toString(randomDoors));
        System.out.println(randomSofiaDoors + "" + randomKdDoors);
        }
    }
