package com.arrays.homework;                                    //package where file is located

import java.util.*;                                             //import utilities for class

public class homework11 {                                       //main class "homework11"
    public static int[] implArr = startMassive();               //initialization massive with random elements and range from 10 to -10 with using startMassive method



    public static void main(String[] args) {                    //program entry point

        int [] arrZ = Arrays.copyOf(implArr,implArr.length);    //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int[] z = swapMaxNegMinPos(arrZ);                       //initialization method "swapMaxNegMinPos" for array "implArr"
        System.out.println(Arrays.toString(z));                 //sout array "implArr" with swap Max Negative and Min Positive numbers

        int [] arrX = Arrays.copyOf(implArr,implArr.length);    //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int x = scaleEvenPosition(arrX);                        //initialization method "scaleEvenPosition" for array "implArr"
        System.out.println(x);                                  //sout sum of values with scale index into from array

        int [] arrR = Arrays.copyOf(implArr,implArr.length);    //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int[] r = toZeroNegativeElements(arrR);                 //initialization method "toZeroNegativeElements" for array "implArr"
        System.out.println(Arrays.toString(r));                 //sout array "implArr" with substitutes zeros instead of negative values

        int [] arrY = Arrays.copyOf(implArr,implArr.length);    //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int[] y = triplePosNumBeforeNeg(arrY);                  //initialization method "triplePosNumBeforeNeg" for array "implArr"
        System.out.println(Arrays.toString(y));                 //sout array "implArr" with triples positive values before negative ones

        int [] arrP = Arrays.copyOf(implArr,implArr.length);    //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        double p = averageSubMin(arrP);                         //initialization method "averageSubMin" for array "implArr"
        System.out.println(p);                                  //sout difference between the arithmetic mean and the value of the minimum element

        int [] arrO = Arrays.copyOf(implArr,implArr.length);    //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        Integer[] o = repeatOddIndex(arrO);                     //initialization method "repeatOddIndex" for array "implArr"
        System.out.println(Arrays.toString(o));                 //sout array with repeat values with odd index
    }

    static public int[] startMassive() {                        //method that generated massive with random elements and range from 10 to -10

        int low = -10;                                          //initialization lower number in range
        int up = 10;                                            //initialization upper number in range

        int range = (up - low) + 1;                             //initialization range from 10 to -10. write + 1 because use 0 in range

        int[] arr = new int[20];                                //initialization array with length 20 symbols
        for (int i = 0; i < arr.length; i++) {                  //array iteration
            arr[i] = (int) (Math.random() * range) + low;       //assigning random numbers to an array from 10 to -10
        }
        System.out.println(Arrays.toString(arr));               //print array "arr" with length 20 and random numbers, range whose from 10 to -10
        return arr;                                             //returns array "arr" with length 20 and random numbers, range whose from 10 to -10
    }

    static public int minValue(int[] args) {                    //method that compute min value in array

        int min = args[0];
        for (int i : args) {                                    //а loop with iteration for found min value
            if (i < min) {
                min = i;
            }
        }
        return min;                                             //returns min value
    }

    static public int maxValue(int[] args) {                    //method that compute max value in array

        int max = args[0];                                      //а loop with iteration for found max value
        for (int i : args) {
            if (i > max) {
                max = i;
            }
        }
        return max;                                             //returns max value
    }

    static public int maxNegativeNumberIndex(int[] args) {      //method that found max negative number in massive

        int maxNegNum = minValue(args);                         //get min value in array

        int maxInd = 0;                                         //initialization variable for storage index max negative number

        for (int i = 0; i < args.length - 1; i++) {             //а loop with iteration for find max negative value and its index
            if (maxNegNum <= args[i + 1]) {
                if (args[i + 1] < 0) {
                    maxNegNum = args[i + 1];
                    maxInd = i + 1;
                }
            }
        }
        return maxInd;                                          //returns max negative number index
    }

    static public int minPositiveNumberIndex(int[] args) {      //method that found min positive number in massive

        int minPosNum = maxValue(args);                         //get max value in array

        int minInd = 0;                                         //initialization variable for storage index min positive number

        for (int i = 0; i < args.length - 1; i++) {             //а loop with iteration for find min positive value and its index
            if (minPosNum >= args[i + 1]) {
                if (args[i + 1] >= 0) {
                    minPosNum = args[i + 1];
                    minInd = i + 1;
                }
            }
        }
        return minInd;                                          //returns min positive number index
    }

    static public int[] swapMaxNegMinPos(int[] args) {          //method that swap max negative and min positive numbers in array

        int minPos = minPositiveNumberIndex(args);              //put the min positive value index in new variable "minPos"
        int maxNeg = maxNegativeNumberIndex(args);              //put the max negative value index in new variable "maxNeg"
        int temp = args[minPos];                                //initialization variable "temp" for swap values on index
        args[minPos] = args[maxNeg];                            //swaps "minPos" and "negPos" with using variable "temp"
        args[maxNeg] = temp;

        return args;                                            //returns massive with swaps min positive and max negative values
    }

    static public int scaleEvenPosition(int[] args) {           //method that addition all values on scale indexes in array

        int count = 0;                                          //initialization variable "count" for storage addend variables

        for (int i = 0; i < args.length; i++) {                 //а loop with iteration for find scale indexes
            if (i % 2 == 0) {
                count = Math.abs(args[i]) + count;              //addition scale indexes with using variable "count"
            }
        }
        return count;                                           //returns the stacked elements at an even index
    }

    static public int[] toZeroNegativeElements(int[] args) {    //a method that substitutes zeros instead of negative values in an array

        for (int i = 0; i < args.length; i++) {                 //а loop with iteration for find negative elements
            if (args[i] < 0) {
                args[i] = 0;                                    //substitutes zeros instead of negative values
            }
        }
        return args;                                            //returns the array with substitutes zeros instead of negative values
    }

    static public int[] triplePosNumBeforeNeg(int[] args) {     //а method that triples positive values before negative ones

        for (int i = 0; i < args.length - 1; i++) {             //а loop with iteration for find positive values before negative ones
            if (args[i] >= 0 && args[i + 1] < 0) {
                args[i] = args[i] * 3;                          //triple positive values before negative ones
            }
        }
        return args;                                            //returns the array with triple positive values before negative ones
    }

    static public double averageSubMin(int[] args) {            //а method that return the difference between the arithmetic mean and the value of the minimum element

        double min = minValue(args);                            //get min value in array

        double count = 0.0;                                     //initialization variable "count" for storage addend variables

        for (int arg : args) {                                  //а loop with iteration for addition all indexes
            count = arg + count;
        }

        double arMean = count / args.length;                    //find arithmetic mean of all values in array

        double avSubMin = arMean - min;                         //get the difference between the arithmetic mean and the value of the minimum element

        return avSubMin;                                        //returns difference between the arithmetic mean and the value of the minimum element
    }

    static public Integer[] repeatOddIndex(int[] args) {        //a method that outputs all elements that occur more than once and whose indexes are odd

        ArrayList <Integer> arr = new ArrayList<>();            //create new ArrayList "arr" where will contain elements

        for (int i = 0; i < args.length; i++) {                 //а loop with iteration for find and return in array "arr" repeat values with odd index
            for (int j = i + 1; j < args.length - 1; j++) {
                if (i % 2 != 0 && args[i] == args[j]) {         //check for odd index and repeat
                    arr.add(args[i]);                           //add in array "arr" repeat values with odd index
                }
            }
        }
        return arr.toArray(new Integer[0]);                     //returns array with repeat values with odd index
    }

}
