package com.techsqually.java.datastructure.collections.lists.arraylist.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> abc = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));
        Collections.sort(abc);
        System.out.println(abc);


    }
}
