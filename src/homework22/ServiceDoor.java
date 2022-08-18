package com.homeworks.homework22;

import java.util.ArrayList;
import java.util.Arrays;

import static com.homeworks.homework22.RandomArray.*;

public class ServiceDoor {
    public static void printArraysWithSameTypes() {
        Door[] randomDoors = getRandomDoors();
        System.out.println(Arrays.toString(randomDoors));

        ArrayList<Door> sofiaArray = new ArrayList<>();
        ArrayList<Door> kdArray = new ArrayList<>();

        for (int i = 0; i < randomDoors.length; i++){
            if (randomDoors[i] instanceof Sofia){
                sofiaArray.add(randomDoors[i]);
            }
            else {
                kdArray.add(randomDoors[i]);
            }
        }

        ArrayList<ArrayList<Door>> sameArray = new ArrayList<ArrayList<Door>>();
        sameArray.add(sofiaArray);
        sameArray.add(kdArray);

        System.out.println(sameArray);
        }
    }
