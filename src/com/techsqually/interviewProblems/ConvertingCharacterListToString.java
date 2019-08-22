package com.techsqually.interviewProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ConvertingCharacterListToString {

    public static void main(String[] args) {


        String givenString = "Arpan";

         //Converting given String into a List
        ArrayList<Character> characterList  = (ArrayList<Character>) givenString
                                                                       .chars()
                                                                       .mapToObj(c -> (char)c)
                                                                       .collect(Collectors.toList());



        //To get the set of Unique value from a String
        HashSet<Character> characterHashSet  = (HashSet<Character>) givenString
                                                                       .chars()
                                                                       .mapToObj(c -> (char)c)
                                                                       .collect(Collectors.toSet());

        //converting character list by adding addition delimiter
        System.out.println(characterList.stream().map(String::valueOf)
                .collect(Collectors.joining(",")));

        //Converting given list into a String
        givenString = characterList
                                .stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining());
    }
}
