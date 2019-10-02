package com.techsqually.java.problemSolving.strings;

import java.util.stream.Collectors;

public class TwoCharacters {


    public static void main(String[] args) {

//        String givenString = "arpan";

        System.out.println(alternate("asvkuggiugsalddlasguiggukvsa"));


    }


    // Complete the alternate function below.
    static int alternate(String s) {


        int count = 1;
        int maxLength = Integer.MIN_VALUE;
        boolean uniqeCharString = false;
        char temp = 'a';
        int startIndex = 0;
        int endIndex = 0;

        String givenString = s.chars().sorted().mapToObj(i -> (char) i).map(String::valueOf).collect(Collectors.joining());

        System.out.println(givenString);
        for (int i = 0; i < givenString.length() - 1; i++) {

            if (count == 1) {
                temp = givenString.charAt(i);
                startIndex = i;
                endIndex = i + 1;
            }

            if (givenString.charAt(i + 1) - givenString.charAt(i) == 0 ||
                    givenString.charAt(i + 1) - temp <= 1) {
                count++;
                endIndex++;
            } else {
                uniqeCharString = !givenString.substring(startIndex, endIndex).contains(Character.toString((char) ((int) temp + 1)));
                count = 1;
            }

            if (count > maxLength) {
                maxLength = count;
            }

            if (uniqeCharString) {
                maxLength = 0;
                uniqeCharString = false;
            }


        }

        return maxLength;

    }
}
