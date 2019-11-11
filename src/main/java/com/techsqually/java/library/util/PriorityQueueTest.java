package com.techsqually.java.library.util;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {

        PriorityQueue<String> abc = new PriorityQueue<>();

        abc.add("kiran");
        abc.add("arpan");
        abc.add("boy");
        abc.add("saini");

        System.out.println(abc);
        System.out.println(abc.poll());
        System.out.println(abc);

    }
}
