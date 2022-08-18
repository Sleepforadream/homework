package com.homeworks.homework;                                                         //package where file is located

import java.util.*;                                                                  //import utilities for class

public class homework11 {                                                            //main class "homework11"
    public static int[] implArr = getRandomMassive();                                //initialization massive with random elements and range from 10 to -10 with using startMassive method

    public static void main(String[] args) {                                         //program entry point

        int[] copyImplArrOne = Arrays.copyOf(implArr, implArr.length);               //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int[] swapsRandomArr = swapMaxNegMinPos(copyImplArrOne);                     //initialization method "swapMaxNegMinPos" for array "implArr"
        System.out.println(Arrays.toString(swapsRandomArr));                         //sout array "implArr" with swap Max Negative and Min Positive numbers

        int[] copyImplArrTwo = Arrays.copyOf(implArr, implArr.length);               //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int sumEvenIndexes = scaleEvenPosition(copyImplArrTwo);                      //initialization method "scaleEvenPosition" for array "implArr"
        System.out.println(sumEvenIndexes);                                          //sout sum of values with scale index into from array

        int[] copyImplArrThree = Arrays.copyOf(implArr, implArr.length);             //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int[] arrNegativesToZero = toZeroNegativeElements(copyImplArrThree);         //initialization method "toZeroNegativeElements" for array "implArr"
        System.out.println(Arrays.toString(arrNegativesToZero));                     //sout array "implArr" with substitutes zeros instead of negative values

        int[] copyImplArrFour = Arrays.copyOf(implArr, implArr.length);              //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        int[] tripleIndexesBeforeNegative = trebleToPosNumBeforeNeg(copyImplArrFour);//initialization method "triplePosNumBeforeNeg" for array "implArr"
        System.out.println(Arrays.toString(tripleIndexesBeforeNegative));            //sout array "implArr" with triples positive values before negative ones

        int[] copyImplArrFive = Arrays.copyOf(implArr, implArr.length);              //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        double averageSubMin = getAverageSubMin(copyImplArrFive);                    //initialization method "averageSubMin" for array "implArr"
        System.out.println(averageSubMin);                                           //sout difference between the arithmetic mean and the value of the minimum element

        int[] copyImplArrSix = Arrays.copyOf(implArr, implArr.length);               //copy generated with random numbers array "implArr" for create instance and to avoid overlap
        Integer[] repeatedOddIndex = getRepeatOddIndex(copyImplArrSix);              //initialization method "repeatOddIndex" for array "implArr"
        System.out.println(Arrays.toString(repeatedOddIndex));                       //sout array with repeat values with odd index
    }

    /**
     * Returns array with length 20 and random numbers, range whose from 10 to -10
     *
     * @return array with length 20 and random numbers, range whose from 10 to -10
     */
    static public int[] getRandomMassive() {

        int low = -10;                                                       //initialization lower number in range
        int up = 10;                                                         //initialization upper number in range

        int range = (up - low) + 1;                                          //initialization range from 10 to -10. write + 1 because use 0 in range

        int[] arr = new int[20];                                             //initialization array with length 20 symbols
        for (int i = 0; i < arr.length; i++) {                               //array iteration
            arr[i] = (int) (Math.random() * range) + low;                    //assigning random numbers to an array from 10 to -10
        }
        System.out.println(Arrays.toString(arr));                            //print array "arr" with length 20 and random numbers, range whose from 10 to -10
        return arr;
    }

    /**
     * Returns the element with min value in array
     *
     * @param args the array whose minimum element is being searched for
     * @return the element with min value in array
     */
    static public int getMinValue(int[] args) {

        int min = args[0];
        for (int i : args) {                                                 //а loop with iteration for found min value
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Returns the element with max value in array
     *
     * @param args the array whose maximum element is being searched for
     * @return the element with max value in array
     */
    static public int getMaxValue(int[] args) {

        int max = args[0];                                                   //а loop with iteration for found max value
        for (int i : args) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Returns index max negative number in array
     *
     * @param args array in which to find the maximum negative number
     * @return index max negative number in array
     */
    static public int getMaxNegativeNumberIndex(int[] args) {

        int maxNegNum = getMinValue(args);                                   //get min value in array

        int maxInd = 0;                                                      //initialization variable for storage index max negative number

        for (int i = 0; i < args.length - 1; i++) {                          //а loop with iteration for find max negative value and its index
            if (maxNegNum <= args[i + 1]) {
                if (args[i + 1] < 0) {
                    maxNegNum = args[i + 1];
                    maxInd = i + 1;
                }
            }
        }
        return maxInd;
    }

    /**
     * Returns index min positive number in array
     *
     * @param args array in which to find the minimum positive number
     * @return index min positive number in array
     */
    static public int getMinPositiveNumberIndex(int[] args) {

        int minPosNum = getMaxValue(args);                                   //get max value in array

        int minInd = 0;                                                      //initialization variable for storage index min positive number

        for (int i = 0; i < args.length - 1; i++) {                          //а loop with iteration for find min positive value and its index
            if (minPosNum >= args[i + 1]) {
                if (args[i + 1] >= 0) {
                    minPosNum = args[i + 1];
                    minInd = i + 1;
                }
            }
        }
        return minInd;
    }

    /**
     * Returns array with swap max negative and min positive numbers
     *
     * @param args array in which to swap max negative and min positive numbers
     * @return array with swap max negative and min positive numbers
     */
    static public int[] swapMaxNegMinPos(int[] args) {

        int minPos = getMinPositiveNumberIndex(args);                        //put the min positive value index in new variable "minPos"
        int maxNeg = getMaxNegativeNumberIndex(args);                        //put the max negative value index in new variable "maxNeg"
        int temp = args[minPos];                                             //initialization variable "temp" for swap values on index
        args[minPos] = args[maxNeg];                                         //swaps "minPos" and "negPos" with using variable "temp"
        args[maxNeg] = temp;

        return args;
    }

    /**
     * Returns the sum of elements in even indexes
     *
     * @param args array in which sum elements in even indexes
     * @return the sum of elements in even indexes
     */
    static public int scaleEvenPosition(int[] args) {

        int count = 0;                                                       //initialization variable "count" for storage addend variables

        for (int i = 0; i < args.length; i++) {                              //а loop with iteration for find scale indexes
            if (i % 2 == 0) {
                count = Math.abs(args[i]) + count;                           //addition scale indexes with using variable "count"
            }
        }
        return count;
    }

    /**
     * Replaces negative elements with zeros
     *
     * @param args array in which replaces negative elements with zeros
     * @return array with replace negative elements with zeros
     */
    static public int[] toZeroNegativeElements(int[] args) {

        for (int i = 0; i < args.length; i++) {                              //а loop with iteration for find negative elements
            if (args[i] < 0) {
                args[i] = 0;                                                 //substitutes zeros instead of negative values
            }
        }
        return args;
    }

    /**
     * Triples positive values before negative ones
     *
     * @param args array in which triples positive values before negative ones
     * @return array with triples positive values before negative ones
     */
    static public int[] trebleToPosNumBeforeNeg(int[] args) {

        for (int i = 0; i < args.length - 1; i++) {                          //а loop with iteration for find positive values before negative ones
            if (args[i] >= 0 && args[i + 1] < 0) {
                args[i] = args[i] * 3;                                       //triple positive values before negative ones
            }
        }
        return args;
    }

    /**
     * Return the difference between the arithmetic mean and the value of the minimum element
     *
     * @param args array in which the difference is subtracted
     * @return the difference between the arithmetic mean and the value of the minimum element
     */
    static public double getAverageSubMin(int[] args) {

        double min = getMinValue(args);                                      //get min value in array

        double count = 0.0;                                                  //initialization variable "count" for storage addend variables

        for (int arg : args) {                                               //а loop with iteration for addition all indexes
            count = arg + count;
        }

        double arMean = count / args.length;                                 //find arithmetic mean of all values in array

        return arMean - min;
    }

    /**
     * Outputs all elements that occur more than once and whose indexes are odd
     *
     * @param args array in which output is made
     * @return array with all elements that occur more than once and whose indexes are odd
     */
    static public Integer[] getRepeatOddIndex(int[] args) {

        ArrayList<Integer> arr = new ArrayList<>();                          //create new ArrayList "arr" where will contain elements

        for (int i = 0; i < args.length; i++) {                              //а loop with iteration for find and return in array "arr" repeat values with odd index
            for (int j = i + 1; j < args.length - 1; j++) {
                if (i % 2 != 0 && args[i] == args[j]) {                      //check for odd index and repeat
                    arr.add(args[i]);                                        //add in array "arr" repeat values with odd index
                }
            }
        }
        return arr.toArray(new Integer[0]);
    }

}
