package com.techsqually.java.datastructure.collections.arrays.basics;

import com.sun.deploy.util.ArrayUtil;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterArraySubStream {

    public static void main(String[] args) {


        String givenString = "MyNameIsArpan";
        char[] givenchararray = givenString.toCharArray();

        /*First way is to convert the character Array*/
       Object[] ints = givenString.chars().mapToObj(i -> (char)i).toArray();

       String subString = Arrays.stream(ints,2,6).map(i -> (char)i).map(String::valueOf).collect(Collectors.joining());
       System.out.println(subString);

       /**Second way to get Character array*/

        Character[] charObjectArray =
                givenString.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        String subStringFromCharacterArray = Arrays.stream(charObjectArray,2,6).map(String::valueOf).collect(Collectors.joining());
        System.out.println(subStringFromCharacterArray);



    }
}
