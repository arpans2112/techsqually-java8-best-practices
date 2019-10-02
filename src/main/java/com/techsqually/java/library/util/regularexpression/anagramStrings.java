package com.techsqually.java.library.util.regularexpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class anagramStrings {


    public static void main(String[] args) {

        int count = findAnagramsInAGivenStrings("arpan", "Hi arpan Aarpn we are testing rapan rranp anagram");
        System.out.println(count);
    }


    /**
     * <p> Use to find the number of anagrams of a word in a Given String</p>
     *
     * @param : word : is the word for which you want to find the anagrams
     * @param : givenString : is the string in which you want to find the anagrams of word given
     * @return : total number of anagrams of the word passed
     * <p>
     * all words in which each character count is same but their order can be different
     * e.g arpan and rapan are anagrams
     * @output of above given example is 3, "arpan" , "Aarpn" and rapan are anagrams of arpan
     */
    public static int findAnagramsInAGivenStrings(String word, String givenString) {

        word = word.toLowerCase();
        givenString = givenString.toLowerCase();
        HashMap<String, Integer> numberOfAnnagrams = new HashMap<>();
        Matcher matcher = Pattern.compile("[" + word + "]{" + word.length() + "}").matcher(givenString);

        int count = 0;
        while (matcher.find()) {

            char[] matchWordArray = matcher.group().toCharArray();
            char[] givenWordArray = word.toCharArray();
            Arrays.sort(matchWordArray);
            Arrays.sort(givenWordArray);

            if (Arrays.equals(matchWordArray, givenWordArray)) count++;
        }

        return count;
    }
}
