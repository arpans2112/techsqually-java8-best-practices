package com.techsqually.problemSolving;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueCharacterInStringTest {

    public static void main(String[] args) {

        String given = "asdcbsdcagfsdbAgdfanBfghbsfdabxyz";
        char[] characterArray = given.toCharArray();

        //To get the character whose unicode value is greater than 118.
        //https://unicode-table.com/en/#basic-latin
        /*
        * a-z - 97 - 122
        * A-Z - 65 - 90
        * */

        //To get letters w,x ,y ,z from the given string
        given.chars().filter(a -> a > 118).mapToObj(c -> (char)c).forEach(a -> System.out.println(a));

        //To get capital Letters out of stream
        given.chars().filter(a -> a >= 65 && a <= 90).mapToObj(c -> (char)c).forEach(a -> System.out.println(a));

        // Returns the unique values.
        HashSet<Character> abc = (HashSet<Character>) given.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
        System.out.println(abc);

        // To get array List
       ArrayList<Character> characterList = (ArrayList<Character>) given.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
       Collections.sort(characterList);
       System.out.println(characterList);
    }
}
