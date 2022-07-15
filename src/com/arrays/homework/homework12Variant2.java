package com.arrays.homework;                                                        //package where file is located

import java.util.ArrayList;                                                         //import ArrayList

import static com.arrays.homework.homework12Variant1.*;                             //import class "homework12Variant1"

public class homework12Variant2 {                                                   //main class "homework12Variant2"

    public static void main(String[] args) {                                        //program entry point

        String x = stringsBiggerThanAverageLength(implString);                      //initialization value x and assign it strings bigger than average length in array
        System.out.println(x);                                                      //sout strings bigger than average length in array
    }

    static public String stringsBiggerThanAverageLength(ArrayList<String> str) {    //method then return strings bigger than average length in array

        String count = "";                                                          //initialization String count for storage strings bigger than average length

        for (int i = 0; i < str.size(); i++) {                                      //loop checking if strings are greater than average length and adding them in "count"
            if (str.get(i).length() > averageLength(str)) {
                count = count + (str.get(i)) + " ";
            }
        }
        return count;                                                               //return strings bigger than average length in array
    }
}
