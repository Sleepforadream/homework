package com.homeworks.homework;                                                        //package where file is located

import java.util.ArrayList;                                                         //import ArrayList

import static com.homeworks.homework.homework12Variant1.*;                             //import class "homework12Variant1"

public class homework12Variant3 {                                                   //main class "homework12Variant3"

    public static void main(String[] args) {                                        //program entry point

        String strLessThanAverLength = getStrLessThanAverLength(implString);        //initialization method "getStrLessThanAverLength"
        System.out.println(strLessThanAverLength);                                  //sout strings less than average length in array
    }

    /**
     * Returns strings less than average length
     *
     * @param str array from which get strings less than average length
     * @return strings less than average length
     */
    static public String getStrLessThanAverLength(ArrayList<String> str) {

        String count = "";                                                          //initialization String count for storage strings less than average length

        for (int i = 0; i < str.size(); i++) {                                      //loop checking if strings are less than average length and adding them in "count"
            if (str.get(i).length() < getAverageLength(str)) {
                count = count + (str.get(i)) + " ";
            }
        }
        return count;
    }
}
