package com.techsqually.java.problemSolving.strings;

public class ConvertingCharArrayToString {

    public static void main(String[] args) {

        String given = "Arpan";
        //Converting given String to Character Array
        char[] charArray = given.toCharArray();

        //Converting Character Array into a String
        System.out.println(String.valueOf(charArray));

    }
}
