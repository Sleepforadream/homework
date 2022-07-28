package com.homeworks.homework;                                                                    //package where file is located

import java.util.ArrayList;

import static com.homeworks.homework.homework12Variant1.implString;
import static com.homeworks.homework.homework12Variant4.*;

public class homework12Variant5 {                                                               //main class "homework12Variant5"

    public static void main(String[] args) {                                                    //program entry point

        String stringWithUniqueSymbols = getStringWithUniqueSymbols(implString);                //initialization method "getStringWithUniqueSymbols"
        System.out.println(stringWithUniqueSymbols);                                            //sout string with only unique symbols
    }

    /**
     * Returns string with only unique symbols
     *
     * @param str array from which get string with only unique symbols
     * @return string with only unique symbols
     */
    static public String getStringWithUniqueSymbols(ArrayList<String> str) {

        ArrayList<Integer> arr = getQuantityOfUniqueSymbols(str);                               //initialize ArrayList for get array with quantity of unique symbols
        String index = "";                                                                      //initialize variable for storage index string with only unique symbols

        for (int i = 0; i < arr.size(); i++) {                                                  //loop for find index string with only unique symbols
            if (str.get(i).length() == arr.get(i)) {
                index = str.get(i);
            }
        }
        return index;
    }
}
