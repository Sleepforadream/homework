package com.arrays.homework;                                        //package where file is located

import java.util.*;                                                 //import utilities for class

public class homework12Variant1 {                                   //main class "homework12Variant1"
    public static ArrayList<String> implString = startString();     //initialize ArrayList with strings entered from the keyboard


    public static void main(String[] args) {                        //program entry point

        int x = indexShortString(implString);                       //initialization value x and add index the shortest string of array implString
        int x1 = lengthShortString(implString);                     //initialization value x1 and add length of the shortest string of array implString

        int y = indexLongString(implString);                        //initialization value y and add index the longest string of array implString
        int y1 = lengthLongString(implString);                      //initialization value y1 and add length of the longest string of array implString

        System.out.println(x + " " + x1);                           //sout index the shortest string and length of the shortest string
        System.out.println(y + " " + y1);                           //sout index the longest string and length of the longest string
    }

    static public ArrayList<String> startString() {                 //method then sum strings which keyboard input

        Scanner sc = new Scanner(System.in);                        //initialization scanner

        ArrayList<String> massive = new ArrayList<>();              //initialization ArrayList "massive"

        while (sc.hasNextLine()) {                                  //loop then sum strings which keyboard input
            String input = sc.nextLine();
            if (!input.equals("")) {
                massive.add(input);
            }
            if (input.equals("")) {                                 //if keyboard input "" exit from loop
                break;
            }
        }

        return massive;                                             //return array with all string which keyboard input
    }

    static public int indexShortString(ArrayList<String> str) {     //method then return index the shortest string in array

        int index = 0;                                              //initialization variable "index" for count index the shortest string in array

        int min = (str.get(0)).length();                            //loop then calculate index the shortest string in array
        for (int i = 0; i < str.size(); i++) {
            if ((str.get(i)).length() < min) {
                min = (str.get(i)).length();
                index = i;
            }
        }

        return index;                                               //return index the shortest string in array
    }

    static public int lengthShortString(ArrayList<String> str) {    //method then return length of the shortest string in array

        int min = (str.get(0)).length();                            //loop then calculate length the shortest string in array
        for (String s : str) {
            if (s.length() < min) {
                min = s.length();
            }
        }

        return min;                                                 //return length of the shortest string in array
    }

    static public int indexLongString(ArrayList<String> str) {      //method then return index the longest string in array

        int index = 0;                                              //initialization variable "index" for count index the longest string in array

        int max = (str.get(0)).length();                            //loop then calculate index the longest string in array
        for (int i = 0; i < str.size(); i++) {
            if ((str.get(i)).length() > max) {
                max = (str.get(i)).length();
                index = i;
            }
        }

        return index;                                               //return index the longest string in array
    }

    static public int lengthLongString(ArrayList<String> str) {     //method then return length of the longest string in array

        int max = (str.get(0)).length();                            //loop then calculate length the longest string in array
        for (String s : str) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        return max;                                                 //return length of the longest string in array
    }

    static public double averageLength(ArrayList<String> str) {     //method then return average length strings in array

        double lengths = 0.0;                                       //initialization variable counts length all strings

        for (String s : str) {                                      //loop calculated lengths strings in array
            lengths = lengths + s.length();
        }

        return lengths / str.size();                                //get average length strings in array and return it
    }
}
