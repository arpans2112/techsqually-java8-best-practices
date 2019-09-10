package com.techsqually.java.library.util;

public class StringTest {

    public static void main(String[] args) {

        String givenString = "Arpan";

        int n = givenString.length();
        int start = 0;
        while (n-- > 0) {

            if (givenString.charAt(start) == 'A') {
                System.out.println("Found character");
            }
            start++;
        }


    }


}
