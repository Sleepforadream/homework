package com.arrays.homework;                                                                    //package where file is located

import java.util.ArrayList;

import static com.arrays.homework.homework12Variant1.implString;

public class homework12Variant4 {                                                               //main class "homework12Variant4"

    public static void main(String[] args) {                                                    //program entry point

        String strMinDiffSymbols = getStrMinDiffSymbols(implString);                            //initialization method "getStrMinDiffSymbols"
        System.out.println(strMinDiffSymbols);                                                  //sout string with the least repeated characters
    }

    /**
     * Returns array with special index quantity of different symbols
     *
     * @param str array from which get special index quantity of different symbols
     * @return array with special index quantity of different symbols
     */
    static public ArrayList<Integer> getQuantityOfDifferentSymbols(ArrayList<String> str) {

        int count = 0;                                                                          //initialize counter for storage index of different symbols in string

        ArrayList<Integer>arr = new ArrayList<>();                                              //initialize ArrayList for storage index of different symbols in string
        String charToStrVarJ;                                                                   //initialize variable to change type value "j" from character to string
        String charToStrVarK;                                                                   //initialize variable to change type value "k"  from character to string

        for (String s : str) {                                                                  //loop for calculate index of different symbols in string
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    charToStrVarJ = Character.toString(s.charAt(j));
                    charToStrVarK = Character.toString(s.charAt(k));
                    if (!charToStrVarJ.equals(charToStrVarK)) {
                        count++;
                    }
                }
            }
            arr.add(count + s.length());
            count = 0;
        }
        return arr;
    }

    /**
     * Returns index string with less repetition of characters
     *
     * @param str array from which get index string with less repetition of characters
     * @return index string with less repetition of characters
     */
    static public Integer getIndexMinDifferentSymbols(ArrayList<String> str) {

        ArrayList<Integer> arr = getQuantityOfDifferentSymbols(implString);                     //initialize ArrayList and assign it array indexes quantity of different symbols

        int min = (arr.get(0));                                                                 //initialize variable with 0 index for storage index comparisons in loop

        int index = 0;                                                                          //initialize variable with 0 for storage index string less repetition of characters

            for (int i = 0; i < arr.size(); i++) {                                              //loop for find index string less repetition of characters
                if (arr.get(i) < min) {
                    min = arr.get(i);
                    index = i;
                }
            }
        return index;
    }

    /**
     * Returns string with the least repetition of characters
     *
     * @param str array from which get string with the least repetition of characters
     * @return string with the least repetition of characters
     */
    static public String getStrMinDiffSymbols(ArrayList<String> str) {

        return str.get(getIndexMinDifferentSymbols(str));
    }

}
