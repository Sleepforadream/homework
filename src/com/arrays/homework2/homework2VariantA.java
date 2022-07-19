package com.arrays.homework2;

import java.util.*;

public class homework2VariantA {
    public static void main(String[] args) {

        CarFactory BMWModels = createCarByMark("BMW");                                              //Create CarFactory "BMWModels" by mark
        Car carBMW = BMWModels.createCar();                                                         //Create car by "BMWModels"
        String[] RandomNumberOfRandomModelsOfBMW = getRandomNumberOfRandomModelsOfCars(carBMW);     //get array with random number of random models of cars

        CarFactory AudiModels = createCarByMark("Audi");                                            //Create CarFactory "AudiModels" by mark
        Car carAudi = AudiModels.createCar();                                                       //Create car by "AudiModels"
        String[] RandomNumberOfRandomModelsOfAudi = getRandomNumberOfRandomModelsOfCars(carAudi);   //get array with random number of random models of cars

        List<String> allModels = new ArrayList<>();                                                 //Create list with all generated models of audi and bmw
        List<String> randomListOfModelsOfBMW = Arrays.asList(RandomNumberOfRandomModelsOfBMW);
        List<String> randomListOfModelsOfAudi = Arrays.asList(RandomNumberOfRandomModelsOfAudi);
        allModels.addAll(randomListOfModelsOfAudi);
        allModels.addAll(randomListOfModelsOfBMW);

        Integer NumberOfEquivalentObjects = getNumberOfEquivalentObjects(allModels);                //sout number of equivalent objects
        System.out.println(NumberOfEquivalentObjects);

        for (String allModel : allModels) {                                                         //sout all element in array "allModels" as strings
            System.out.print(allModel + " ");
        }
    }

    /**
     * Create car by mark
     *
     * @param mark created type of car
     * @return CarFactory which create car by mark
     */
    static CarFactory createCarByMark(String mark) {
        if (mark.equalsIgnoreCase("Audi")) {
            return new AudiFactory();
        } else if (mark.equalsIgnoreCase("BMW")) {
            return new BMWFactory();
        } else {
            throw new RuntimeException(mark + " is unknown mark.");
        }
    }

    /**
     * Get random number of random models of cars
     *
     * @param car created type of car
     * @return array with random number of random models of cars
     */
    static String[] getRandomNumberOfRandomModelsOfCars(Car car) {
        int low = 1;                                                         //initialization lower number in range
        int up = 6;                                                          //initialization upper number in range

        int range = (up - low);                                              //initialization range from 0 to 5

        String[] arr = new String[(int) (Math.random() * range) + low];      //initialization array with random length
        for (int i = 0; i < arr.length; i++) {                               //array iteration
            arr[i] = car.getModel();                                         //assigning random models to an array with random length
        }
        return arr;
    }

    static Integer getNumberOfEquivalentObjects (List<String> allModels){
        Map<String, Integer> counter = new HashMap<>();                                             //Count how many times each value occurs in an array
        for (String x : allModels) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        int count = 0;                                                                              //Count the number of values that occur more than once
        for (int value : counter.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }
}


