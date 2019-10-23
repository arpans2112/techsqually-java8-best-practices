package com.techsqually.java.datastructure.collections.lists.arraylist.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ArrayListTest {


    public static void main(String[] args) {


        List<Integer> abc = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        intList.size();
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(set.pollLast());
        System.out.println(set.pollLast());
        System.out.println(set);






    }
}
