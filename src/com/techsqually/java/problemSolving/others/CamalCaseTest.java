package com.techsqually.java.problemSolving.others;

public class CamalCaseTest {


    public static void main(String[] args) {

        String s = "saveChangesInTheEditor";
        camelCaseWordUsingLoop(s);
        camelCaseWordWithIndexs(s);

    }

    public static void camelCaseWordUsingLoop(String s) {
        String word = "";
        for (int i = 0; i <= s.length(); i++) {

            if (i == s.length()) {
                System.out.println(word);
            } else {
                if (Character.isUpperCase(s.charAt(i))) {
                    System.out.println(word);
                    word = "";
                    word += s.charAt(i);
                } else {
                    word += s.charAt(i);
                }
            }

        }
    }

    public static void camelCaseWordWithIndexs(String s) {


        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)) || i == s.length() - 1) {
                startIndex = endIndex;
                endIndex = i != s.length() - 1 ? i : i + 1;
                System.out.println(s.substring(startIndex, endIndex));
            }
        }


    }


}

