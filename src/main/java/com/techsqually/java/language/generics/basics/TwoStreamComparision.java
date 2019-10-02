package com.techsqually.java.language.generics.basics;

import java.util.Iterator;
import java.util.stream.IntStream;

public class TwoStreamComparision {

    public static void main(String[] args) {

        String a = "Arpan";
        String b = "Arpen";

        IntStream s1 = a.chars();
        IntStream s2 = b.chars();

        Iterator<Integer> s1It = s1.iterator();
        Iterator<Integer> s2It = s2.iterator();

        int count = 0;
        while (s2It.hasNext()) {
            if (!s1It.next().equals(s2It.next())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
