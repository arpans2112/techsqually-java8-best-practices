package com.techsqually.arrayList;

import sun.rmi.log.LogInputStream;

import java.util.LinkedList;


public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("arpan");
        list.add("sanjay");
        list.add("arpan");

        System.out.println(list);
        System.out.println(list.get(2));



    }
}
