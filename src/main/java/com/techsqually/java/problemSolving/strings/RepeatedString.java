package com.techsqually.java.problemSolving.strings;

public class RepeatedString {

    public static void main(String[] args) {

        repeatedString("ababa", 3);

//            long x = 731869010806;
//        long l = Long.parseLong("731869010806");
    }

    static long repeatedString(String s, long n) {


        if (n < s.length()) return (int) s.substring(0, (int) n).chars().filter(i -> i == 'a').count();

        long aInGivenString = (int) s.chars().filter(i -> i == 'a').count();
        long aInRepeadString = n / s.length() * aInGivenString;
        long charsLeft = n % ((n / s.length()) * s.length());
        int aInLeftString = (int) s.substring(0, (int) charsLeft).chars().filter(i -> i == 'a').count();
        return aInRepeadString + aInLeftString;

    }

}
