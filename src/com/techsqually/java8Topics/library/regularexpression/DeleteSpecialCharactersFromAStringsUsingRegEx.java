package com.techsqually.java8Topics.library.regularexpression;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DeleteSpecialCharactersFromAStringsUsingRegEx {

    /*
    * He is a very very good boy isn t he
    *
    * */

    public static void main(String[] args) {

        String input = "He is a very@ very. good! boy, isn't he?";
        System.out.println(stringWithoutSpecialCharacter(input));

    }

    /*
    * @param : givenString that has special Character
    * @returns: String that doesn't has any special Character
    *   For example :
    *          givenString: given String : He is a very@ very. good! boy, isn't he?
    *          return String: He is a very very good boy isn t he
    * */

    public static String stringWithoutSpecialCharacter(String givenString){

        String delims = "[ _'@.,?!]+";
        String[] splitedArray = givenString.split(delims);

        /*
        * Converting String array into a String
        * */
        String stringWithoutSpecialCharacters = Arrays.stream(splitedArray).collect(Collectors.joining(" "));
        return stringWithoutSpecialCharacters;
    }



}
