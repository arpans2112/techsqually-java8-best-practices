package com.techsqually.java.datastructure.collections.arrays.basics;

import java.util.Arrays;

public class CharacterArrayToIntegerArray {


    public static void main(String[] args) {


        String name = "arpan";

        Integer[] intarray = name.chars().mapToObj(i -> i).toArray(Integer[]::new);
        System.out.println(Arrays.toString(intarray));
    }
}
