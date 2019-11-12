package com.techsqually.java.datastructure.collections.arrays.basics;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class OrdersTest {

    public static void main(String[] args) {

       /**Both Maintains insertion order */
        ArrayList<Integer> givenIntArray = new ArrayList<>();
       givenIntArray.add(1);
       givenIntArray.add(2);
       givenIntArray.add(4);
       givenIntArray.add(3);
        System.out.println(givenIntArray);

        LinkedList<Integer> givenList = new LinkedList<>();
        givenList.add(1);
        givenList.add(2);
        givenList.add(3);
        givenList.add(4);
        System.out.println(givenList);

    }
}
