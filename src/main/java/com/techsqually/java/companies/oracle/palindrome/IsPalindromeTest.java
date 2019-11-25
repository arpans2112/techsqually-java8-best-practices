package com.techsqually.java.companies.oracle.palindrome;

public class IsPalindromeTest {


    public static void main(String[] args) {

        System.out.println(isGivenStringPalindrome(null));
    }


    public static boolean isGivenStringPalindrome(String givenString){

        /**You can't call any funtion on null object
         * you must use
         * */

        if(givenString == null){
            return false;
        }

        int startIndex = 0;
        int lastIndex  = givenString.length()-1;


        while(startIndex <= givenString.length()/2){

            if(givenString.charAt(startIndex) != givenString.charAt(lastIndex)){

                return false;
            }

            startIndex++;
            lastIndex--;
        }


        return true;

    }
}
