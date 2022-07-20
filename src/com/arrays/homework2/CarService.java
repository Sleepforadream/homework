package com.arrays.homework2;

import java.util.*;

public class CarService {

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
    static Car[] getRandomNumberOfRandomModelsOfCars(CarFactory car) {
        int low = 1;                                                         //initialization lower number in range
        int up = 6;                                                          //initialization upper number in range

        int range = (up - low);                                              //initialization range from 0 to 5

        Car[] arr = new Car[(int) (Math.random() * range) + low];            //initialization array with random length
        for (int i = 0; i < arr.length; i++) {                               //array iteration
            arr[i] = car.createCar();                                        //assigning random models to an array with random length
        }
        return arr;
    }

    static List<Car> createAllRandomModels() {
        CarFactory AudiModels = createCarByMark("Audi");
        Car[] RandomNumberOfRandomModelsOfBMW = getRandomNumberOfRandomModelsOfCars(AudiModels);

        CarFactory BMWModels = createCarByMark("BMW");
        Car[] RandomNumberOfRandomModelsOfAudi = getRandomNumberOfRandomModelsOfCars(BMWModels);

        List<Car> allModels = new ArrayList<>();
        List<Car> randomListOfModelsOfBMW = Arrays.asList(RandomNumberOfRandomModelsOfBMW);
        List<Car> randomListOfModelsOfAudi = Arrays.asList(RandomNumberOfRandomModelsOfAudi);

        allModels.addAll(randomListOfModelsOfAudi);
        allModels.addAll(randomListOfModelsOfBMW);

        return allModels;
    }

    static Integer getNumberOfEquivalentObjects(List<Car> allModels) {
        Map<Car, Integer> counter = new HashMap<>();                                                //Count how many times each value occurs in an array
        for (Car x : allModels) {
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

    static String stringRepresentationOfAnArray(List<Car> arr) {
        String count = "";
        for (Car allModel : arr) {
            count = (count + allModel + " ");
        }
        return count;
    }
}
