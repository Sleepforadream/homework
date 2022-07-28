package com.homeworks.homework;                                                                    //package where file is located

import java.util.ArrayList;

import static com.homeworks.homework.homework12Variant1.implString;

public class homework12Variant6 {                                                               //main class "homework12Variant6"

    public static void main(String[] args) {                                                    //program entry point

        String stringWithOnlyNumbers = getStringWithOnlyNumbers(implString);                    //initialization method "getStringWithOnlyNumbers"
        System.out.println(stringWithOnlyNumbers);                                              //sout string with only numbers
    }

    /**
     * Returns string with only numbers
     *
     * @param str array from which get string with only numbers
     * @return string with only numbers
     */
    static public String getStringWithOnlyNumbers(ArrayList<String> str) {

        int count = 0;                                                                          //initialize counter for storage repeating value
        int num = 0;                                                                            //initialize variable for storage number elements
        String charToStringVar;                                                                   //variable for storage char in string
        String onlyNumbers = "";                                                                //variable for return only number string

        String[] numbers = new String[10];                                                      //array with numbers from 0 to 9 for check validation chars in string
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = "" + i;
        }

        for (String s : str) {                                                                  //loop for calculate only numbers in string
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < 10; k++) {
                    charToStringVar = Character.toString(s.charAt(j));
                    if (charToStringVar.equals(numbers[k])) {
                        count++;
                    }
                }
                if (count == 1) {
                    num++;
                }
                count = 0;
            }
            if (num == s.length()) {
                onlyNumbers = s;
            }
            num = 0;
        }
        return onlyNumbers;
    }
}
