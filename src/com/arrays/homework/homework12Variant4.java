package com.arrays.homework;                                                                    //package where file is located

import java.util.ArrayList;

import static com.arrays.homework.homework12Variant1.implString;

public class homework12Variant4 {                                                               //main class "homework12Variant4"

    public static void main(String[] args) {                                                    //program entry point

        String z = stringMinDifferentSymbols(implString);                                       //initialize the value of z and assign it the string with the least repetition of characters
        System.out.println(z);                                                                  //sout string with the least repeated characters
    }

    static public ArrayList<Integer> quantityOfDifferentSymbols(ArrayList<String> str) {        //method then return special index quantity of different symbols in array

        int count = 0;                                                                          //initialize counter for storage index of different symbols in string

        ArrayList<Integer>arr = new ArrayList<>();                                              //initialize ArrayList for storage index of different symbols in string

        for (int i = 0; i < str.size(); i++) {                                                  //mega loop for calculate index of different symbols in string
            for (int j = 0; j < str.get(i).length(); j++) {
                for (int k = 0; k < str.get(i).length(); k++) {
                    if (!(Character.toString(str.get(i).charAt(j))).equals(Character.toString(str.get(i).charAt(k)))) {
                        count++;
                    }
                }
            }
            arr.add(count + str.get(i).length());
            count = 0;
        }
        return arr;                                                                             //return special index quantity of different symbols in array
    }

    static public Integer indexMinDifferentSymbols(ArrayList<String> str) {                     //method then return index string with less repetition of characters

        ArrayList<Integer> arr = quantityOfDifferentSymbols(implString);                        //initialize ArrayList and assign it array indexes quantity of different symbols

        int min = (arr.get(0));                                                                 //initialize variable with 0 index for storage index comparisons in loop

        int index = 0;                                                                          //initialize variable with 0 for storage index string less repetition of characters

            for (int i = 0; i < arr.size(); i++) {                                              //loop for find index string less repetition of characters
                if (arr.get(i) < min) {
                    min = arr.get(i);
                    index = i;
                }
            }
        return index;                                                                           //return index string with less repetition of characters
    }

    static public String stringMinDifferentSymbols(ArrayList<String> str) {                     //method then return string with the least repetition of characters

        return str.get(indexMinDifferentSymbols(str));                                          //return strings string with the least repetition of characters through index
    }

}
