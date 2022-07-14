package com.arrays.homework;                                        //package where file is located

import java.util.ArrayList;
import java.util.Scanner;

import static com.arrays.homework.homework12Variant1.*;

public class homework12Variant2 {                                   //main class "MyProgram"

    public static void main(String[] args) {                        //program entry point
        String x = stringsBiggerThanAverageLength(implString);                       //initialization value x and add index the shortest string of array implString
        System.out.println(x);                                      //sout index the shortest string and length of the shortest string
    }

    static public double averageLength(ArrayList<String> str) {     //method then return length of the longest string in array

        double lengths = 0.0;
        double count = 0.0;

        for (String s : str) {
            lengths = lengths + s.length();
            count++;
        }

        return lengths / count;
    }

    static public String stringsBiggerThanAverageLength(ArrayList<String> str) {

        String count = "";

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() > averageLength(str)) {
                count = count + (str.get(i)) + " ";
            }
        }
        return count;
    }
}
