package com.techsqually.java.datastructure.collections.stackqueue;

import java.util.ArrayDeque;

public class ArrayDequeTest {


    public static void main(String[] args) {

        ArrayDeque<Character> characters = new ArrayDeque<>();

        "arpan".chars().mapToObj(i -> (char) i).forEach(i -> {
            characters.addLast(i);
        });


    }
}
