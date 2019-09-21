package com.techsqually.java.problemSolving.strings;

public class ReverseStringPreservingSpaces {


    public static void main(String[] args) {

        reverStringPreserveSpace("I Am Not String");

    }


    public static String reverStringPreserveSpace(String givenString) {


        char[] givenCharArray = givenString.toCharArray();
        char[] resultArray = new char[givenCharArray.length];

        for (int index = 0; index < givenCharArray.length; index++) {
            if (givenCharArray[index] == ' ') {
                resultArray[index] = ' ';
            }
        }


        int startIndex = 0;
        for (int lastIndex = givenCharArray.length - 1; lastIndex >= 0; lastIndex--) {
            if (givenCharArray[lastIndex] != ' ') {
                startIndex = resultArray[startIndex] != ' ' ? startIndex : startIndex + 1;
                resultArray[startIndex] = givenCharArray[lastIndex];
                startIndex++;
            }
        }

        System.out.println(String.valueOf(resultArray));
        return null;


    }
}
