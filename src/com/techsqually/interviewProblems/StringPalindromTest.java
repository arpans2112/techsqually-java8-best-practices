package com.techsqually.interviewProblems;

public class StringPalindromTest {


    public static void main(String[] args) {


        String text = "arpra";
        String reverseString = reverseString(text);

        System.out.println(text.equals(reverseString) ? "is palindrome" : "Not a palindrome");
        System.out.println(isPalindrome(text));
    }


    //Using Recurision
    public static String reverseString(String input){

        if (input.isEmpty() || input == null)
            return input;
        else
            return input.charAt(input.length()-1) + reverseString(input.substring(0,input.length()-1));

    }


    public static String isPalindrome(String input){

        char[] charArray = input.toCharArray();
        int lastIndex = charArray.length-1;

        StringBuilder sb = new StringBuilder();
        while (lastIndex >= 0){
            sb.append(charArray[lastIndex]);
            lastIndex--;
        }

        String reverseString = sb.toString();
        return input.equals(reverseString) ? input + " is palindrome" : input + " Not a palindrome";
    }
}
