package com.techsqually.java.datastructure.collections.lists.arraylist.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> abc = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(abc);
        System.out.println(abc);
    }
}
