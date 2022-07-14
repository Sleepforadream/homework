package com.arrays.homework;                                    //package where file is located

import java.util.*;                                             //import utilities for class

public class homework12 {                                        //main class "MyProgram"
    public static ArrayList<String> implString = startString();               //initialization massive with random elements and range from 10 to -10 with using startMassive method


    public static void main(String[] args) {
        int x = indexShortString(implString);
        int x1 = lengthShortString(implString);
        int y = indexLongString(implString);                       //initialization method "swapMaxNegMinPos" for array "implArr"
        int y1 = lengthLongString(implString);
        System.out.println(x + " " + x1);
        System.out.println(y + " " + y1);
    }

    static public ArrayList<String> startString() {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> massive = new ArrayList<>();

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (!input.equals("")) {
                massive.add(input);
            }
            if (input.equals("")) {
                break;
            }
        }

        return massive;
    }

    static public int indexShortString(ArrayList<String> str) {

        int index = 0;

        int min = (str.get(0)).length();
        for (int i = 0; i < str.size(); i++) {
            if ((str.get(i)).length() < min) {
                min = (str.get(i)).length();
                index = i;
            }
        }

        return index;
    }

    static public int lengthShortString(ArrayList<String> str) {

        int min = (str.get(0)).length();
        for (String s : str) {
            if (s.length() < min) {
                min = s.length();
            }
        }

        return min;
    }

    static public int indexLongString(ArrayList<String> str) {

        int index = 0;

        int max = (str.get(0)).length();
        for (int i = 0; i < str.size(); i++) {
            if ((str.get(i)).length() > max) {
                max = (str.get(i)).length();
                index = i;
            }
        }

        return index;
    }

    static public int lengthLongString(ArrayList<String> str) {

        int max = (str.get(0)).length();
        for (String s : str) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        return max;
    }
}
