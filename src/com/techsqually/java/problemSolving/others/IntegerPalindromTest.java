package com.techsqually.java.problemSolving.others;

public class IntegerPalindromTest {

    public static void main(String[] args) {

        System.out.println(isGivenIntegerAPalindrom(1223221) ? "Integer Palindrome" : "Not an Integer Palindrome");
    }

    public static boolean isGivenIntegerAPalindrom(int givenNumber){

        int palindrome = givenNumber;
        int reverseNumber = 0;
        while (palindrome != 0){
            reverseNumber = reverseNumber * 10 + palindrome % 10;
            palindrome = palindrome / 10;
        }
        return givenNumber == reverseNumber;

    }

}
