package com.techsqually.java.language.generics.basics;

public class GenericComparableMethod {

    public static void main(String[] args) {

        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 2));
        System.out.println(findMax(2, 2));
        System.out.println(findMax(2.0, 4.0));
        System.out.println(findMax('a', 'c'));
        System.out.println(findMax("Arpan", "Saini"));


    }

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        return n < 0 ? b : a;
    }


}
