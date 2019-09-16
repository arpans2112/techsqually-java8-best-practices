package com.techsqually.java.library.stream.liststream;

import java.util.ArrayList;
import java.util.Arrays;

public class ListStreamBasics {


    public static void main(String[] args) {

        ArrayList<Integer> abc = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        /*Get the sum of Integer List*/
        int sum = abc.stream().mapToInt(Integer::intValue).sum();


    }
}
