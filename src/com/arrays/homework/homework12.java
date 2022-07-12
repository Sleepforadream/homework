package com.arrays.homework;                                    //package where file is located

import java.util.*;                                             //import utilities for class

public class homework12 {                                        //main class "MyProgram"
    public static String implArr = startString();               //initialization massive with random elements and range from 10 to -10 with using startMassive method


    public static void main(String[] args) {
        //program entry point
    }

    static public String startString() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String massive = "";
        while (sc.hasNextLine()){
            massive = sc.nextLine() + massive;
            if (sc.nextLine().equals("q")){
                break;
            }
        }
        System.out.println(massive);
        return massive;
    }
}