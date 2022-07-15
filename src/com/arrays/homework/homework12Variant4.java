package com.arrays.homework;                                                                    //package where file is located

import java.util.ArrayList;

import static com.arrays.homework.homework12Variant1.implString;

public class homework12Variant4 {                                                               //main class "homework12Variant4"

    public static void main(String[] args) {                                                    //program entry point

        String strMinDiffSymbols = getStrMinDiffSymbols(implString);                            //initialization method "getStrMinDiffSymbols"
        System.out.println(strMinDiffSymbols);                                                  //sout string with the least repeated characters
    }

    /**
     * Returns array with quantity of unique symbols in string
     *
     * @param str array from which quantity of unique symbols in string
     * @return array with quantity of unique symbols in string
     */
    static public ArrayList<Integer> getQuantityOfUniqueSymbols(ArrayList<String> str) {

        int count = 0;                                                                          //initialize counter for storage repeating value
        int unique = 0;                                                                         //initialize variable for storage unique elements

        ArrayList<Integer> arr = new ArrayList<>();                                             //initialize ArrayList for storage index of different symbols in string
        String charToStrVarJ;                                                                   //initialize variable to change type value "j" from character to string
        String charToStrVarK;                                                                   //initialize variable to change type value "k"  from character to string

        for (String s : str) {                                                                  //loop for calculate unique elements in string
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    charToStrVarJ = Character.toString(s.charAt(j));
                    charToStrVarK = Character.toString(s.charAt(k));
                    if (charToStrVarJ.equals(charToStrVarK)) {
                        count++;
                    }
                }
                if (count == 1) {
                    unique++;
                }
                count = 0;
            }
            arr.add(unique);
            unique = 0;
        }
        return arr;
    }

    /**
     * Returns string with the minimum repetition of characters
     *
     * @param str array from which get string with the least repetition of characters
     * @return string with the minimum repetition of characters
     */
    static public String getStrMinDiffSymbols(ArrayList<String> str) {

        ArrayList<Integer> arr = getQuantityOfUniqueSymbols(str);

        int min = (arr.get(0));
        int index = 0;

        for (int i = 0; i < arr.size(); i++) {                                              //loop for find index string less repetition of characters
            if (arr.get(i) < min) {
                min = arr.get(i);
                index = i;
            }
        }
        return str.get(index);
    }
}
