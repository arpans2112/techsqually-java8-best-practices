package com.techsqually.java.datastructure.collections.arrays.basics;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterArraySubStream {

    public static void main(String[] args) {


        String givenString = "MyNameIsArpan";

       Object[] ints = givenString.chars().mapToObj(i -> (char)i).toArray();

       String subString = Arrays.stream(ints,2,6).map(i -> (char)i).map(String::valueOf).collect(Collectors.joining());
       System.out.println(subString);


    }
}
