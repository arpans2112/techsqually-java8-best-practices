package com.techsqually.java.library.string;

import java.util.Arrays;

public class StringMethods {


    public static void main(String[] args) {


        String name = "Arpan";
        String givenString = "Arpan is Testing String Methods";

        /**Length Example*/
        System.out.println(name.length());

        /**Concat Funtion*/
        System.out.println("four : " + 2 + 2); // Results 22 -> Concate operates from left to Right
        System.out.println("four : " + (2 + 2)); // Results 4 -> if you want to do math operatios close them in braces

        /***/
        System.out.println(name.charAt(1));

        /**get chars method*/
        int startIndex = 9;
        int endIndex = 16;
        /*end index is exclusive*/
        char[] subCarArrayFromAGivenString = new char[endIndex-startIndex];
        givenString.getChars(startIndex,endIndex,subCarArrayFromAGivenString,0);
        System.out.println(subCarArrayFromAGivenString);

        /**getBytes funtion returns the byte array of each character [65, 114, 112, 97, 110]*/

        System.out.println(Arrays.toString(name.getBytes()));



    }
}
