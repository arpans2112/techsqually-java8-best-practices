package com.techsqually.java.datastructure.collections.arrays.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {

        int[] givenArray = new int[]{2, 1, 3, 4, 5};

        Arrays.sort(givenArray);


        Collections.reverse(Arrays.stream(givenArray).boxed().collect(Collectors.toList()));


        System.out.println(Arrays.toString(givenArray));
        Arrays.sort(givenArray);


    }
}
