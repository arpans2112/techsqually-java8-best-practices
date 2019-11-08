package com.techsqually.java.library.string;

public class RegionMatchesMethod {


    public static void main(String[] args) {

        String a = "I'm arpan";
        String b = "arpan is my Brother";
        String c = "Arpan is testing region Match";

        /**Must Return true*/
       boolean caseSensitive = a.regionMatches(4,b,0,5);
       boolean caseInsensitive = a.regionMatches(true,4,b,0,5);

        System.out.println(caseInsensitive);
        System.out.println(caseSensitive);
    }
}
