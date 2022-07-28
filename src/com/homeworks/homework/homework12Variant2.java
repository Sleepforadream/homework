package com.homeworks.homework;                                                        //package where file is located

import java.util.ArrayList;                                                         //import ArrayList

import static com.homeworks.homework.homework12Variant1.*;                             //import class "homework12Variant1"

public class homework12Variant2 {                                                   //main class "homework12Variant2"

    public static void main(String[] args) {                                        //program entry point

        String strBiggerThanAverLength = getStrBiggerThanAverLength(implString);    //initialization method "getStrBiggerThanAverLength"
        System.out.println(strBiggerThanAverLength);                                //sout strings bigger than average length in array
    }

    /**
     * Returns strings bigger than average length
     *
     * @param str array from which get strings bigger than average length
     * @return strings bigger than average length
     */
    static public String getStrBiggerThanAverLength(ArrayList<String> str) {

        String count = "";                                                          //initialization String count for storage strings bigger than average length

        for (int i = 0; i < str.size(); i++) {                                      //loop checking if strings are greater than average length and adding them in "count"
            if (str.get(i).length() > getAverageLength(str)) {
                count = count + (str.get(i)) + " ";
            }
        }
        return count;
    }
}
