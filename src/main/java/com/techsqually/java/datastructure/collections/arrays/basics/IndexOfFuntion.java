package com.techsqually.java.datastructure.collections.arrays.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndexOfFuntion {


    public static void main(String[] args) {


        int[] givenArray = {2,3,4,5};


       List<Integer> givenList = Arrays.stream(givenArray).mapToObj(i ->i).collect(Collectors.toList());
        System.out.println(givenList.indexOf(2));

    }
}
