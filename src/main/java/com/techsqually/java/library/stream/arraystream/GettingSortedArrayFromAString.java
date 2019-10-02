package com.techsqually.java.library.stream.arraystream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GettingSortedArrayFromAString {


    public static void main(String[] args) {

        String givenString = "arpan";


        /** Collection String to a Character Array*/
        Character[] charObjectArray = givenString.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);


        String sortedString = givenString.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(Arrays.toString(charObjectArray));

        System.out.println(sortedString);

    }
}
