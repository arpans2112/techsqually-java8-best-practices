package com.techsqually.java.library.util.regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinduniqueCharacterStringUsingRegex {


    public static void main(String[] args) {


        String givenString = "aaabbccdddddda";

        /**
         * @output: [aaa, a, bb, cc, dddddd]
         * */


        System.out.println(stringsOfUniqeCharacters(givenString));

    }


    public static ArrayList<String> stringsOfUniqeCharacters(String givenString) {

        ArrayList<String> uniqCharStrings = new ArrayList<>();
        givenString.chars().distinct().forEach(c -> {

            String regEx = "[" + (char) c + "]{" + 1 + "," + "}";
            Matcher match = Pattern.compile(regEx).matcher(givenString);

            while (match.find()) {

                uniqCharStrings.add(match.group());
            }
        });

        return uniqCharStrings;
    }


}
