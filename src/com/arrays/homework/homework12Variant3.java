package com.arrays.homework;                                                        //package where file is located

import java.util.ArrayList;                                                         //import ArrayList

import static com.arrays.homework.homework12Variant1.*;                             //import class "homework12Variant1"

public class homework12Variant3 {                                                   //main class "homework12Variant3"

    public static void main(String[] args) {                                        //program entry point

        String x = stringsLessThanAverageLength(implString);                        //initialization value x and assign it strings less than average length in array
        System.out.println(x);                                                      //sout strings less than average length in array
    }

    static public String stringsLessThanAverageLength(ArrayList<String> str) {      //method then return strings less than average length in array

        String count = "";                                                          //initialization String count for storage strings less than average length

        for (int i = 0; i < str.size(); i++) {                                      //loop checking if strings are less than average length and adding them in "count"
            if (str.get(i).length() < averageLength(str)) {
                count = count + (str.get(i)) + " ";
            }
        }
        return count;                                                               //return strings less than average length in array
    }
}
