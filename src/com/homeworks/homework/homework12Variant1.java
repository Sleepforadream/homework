package com.homeworks.homework;                                                //package where file is located

import java.util.*;                                                         //import utilities for class

public class homework12Variant1 {                                           //main class "homework12Variant1"
    public static ArrayList<String> implString = getStartString();          //initialize ArrayList with strings entered from the keyboard
    public static Scanner sc = new Scanner(System.in);                             //??????????????????????initialization scanner

    public static void main(String[] args) {                                //program entry point

        int indexShortString = getIndexShortString(implString);             //initialization method getIndexShortString
        int LengthShortString = getLengthShortString(implString);           //initialization method getLengthShortString

        int IndexLongString = getIndexLongString(implString);               //initialization method getIndexLongString
        int lengthLongString = getLengthLongString(implString);             //initialization method getLengthLongString

        System.out.println(indexShortString + " " + LengthShortString);     //sout index the shortest string and length of the shortest string
        System.out.println(IndexLongString + " " + lengthLongString);       //sout index the longest string and length of the longest string
    }

    /**
     * Returns ArrayList with strings which input from keyboard
     *
     * @return ArrayList with strings which input from keyboard
     */
    static public ArrayList<String> getStartString() {

        ArrayList<String> massive = new ArrayList<>();                      //initialization ArrayList "massive"

        Scanner sc = new Scanner(System.in); //&&&&&&&&

        while (true) {
            assert sc != null;
            if (!sc.hasNextLine()) break;                                   //loop then sum strings which keyboard input
            String input = sc.nextLine();
            if (!input.equals("")) {
                massive.add(input);
            }
            if (input.equals("")) {                                         //if keyboard input "" exit from loop
                break;
            }
        }
        return massive;
    }

    /**
     * Returns index of the shortest string in array
     *
     * @param str array from which get the index of the shortest string
     * @return index of the shortest string in array
     */
    static public int getIndexShortString(ArrayList<String> str) {

        int index = 0;                                                      //initialization variable "index" for count index the shortest string in array

        int min = (str.get(0)).length();                                    //loop then calculate index the shortest string in array
        for (int i = 0; i < str.size(); i++) {
            if ((str.get(i)).length() < min) {
                min = (str.get(i)).length();
                index = i;
            }
        }
        return index;
    }

    /**
     * Returns length of the shortest string in array
     *
     * @param str array from which get length of the shortest string
     * @return length of the shortest string in array
     */
    static public int getLengthShortString(ArrayList<String> str) {

        int min = (str.get(0)).length();                                    //loop then calculate length the shortest string in array
        for (String s : str) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        return min;
    }

    /**
     * Returns index of the longest string in array
     *
     * @param str array from which get index of the longest string
     * @return index of the longest string in array
     */
    static public int getIndexLongString(ArrayList<String> str) {

        int index = 0;                                                      //initialization variable "index" for count index the longest string in array

        int max = (str.get(0)).length();                                    //loop then calculate index the longest string in array
        for (int i = 0; i < str.size(); i++) {
            if ((str.get(i)).length() > max) {
                max = (str.get(i)).length();
                index = i;
            }
        }
        return index;
    }

    /**
     * Returns length of the longest string in array
     *
     * @param str array from which get length of the longest string
     * @return length of the longest string in array
     */
    static public int getLengthLongString(ArrayList<String> str) {

        int max = (str.get(0)).length();                                    //loop then calculate length the longest string in array
        for (String s : str) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    /**
     * Returns average length of string in array
     *
     * @param str array from which get average length of string in array
     * @return average length of string in array
     */
    static public double getAverageLength(ArrayList<String> str) {

        double lengths = 0.0;                                               //initialization variable counts length all strings

        for (String s : str) {                                              //loop calculated lengths strings in array
            lengths = lengths + s.length();
        }
        return lengths / str.size();
    }
}