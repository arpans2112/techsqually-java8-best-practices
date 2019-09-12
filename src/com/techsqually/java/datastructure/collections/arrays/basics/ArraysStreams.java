package com.techsqually.java.datastructure.collections.arrays.basics;

import java.util.Arrays;

public class ArraysStreams {


    public static void main(String[] args) {


        int[] a = {1, 3, 4};

        System.out.println(Arrays.stream(a).max().getAsInt());


//        Arrays.stream(a).map(Comparator::comparingInt).max()

    }
}
