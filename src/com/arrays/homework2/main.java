package com.arrays.homework2;

import java.util.*;

public class main extends CarService {
    public static void main(String[] args) {

        List<Car> allRandomModels = createAllRandomModels();
        String ModelsInString = stringRepresentationOfAnArray(allRandomModels);
        Integer NumberOfEquivalentObjects = getNumberOfEquivalentObjects(allRandomModels);
        System.out.println(ModelsInString);
        System.out.println(NumberOfEquivalentObjects);
    }
}




