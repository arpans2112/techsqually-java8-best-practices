package com.techsqually.java.datastructure.collections.arrays.basics;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ArraysStreams {


    public static void main(String[] args) {


        int[] a = {97, 97, 98, 99, 100, 101};
        String[] b = {"1", "2"};
        char[] c = {'1', '2'};


        System.out.println(stream(a).max().getAsInt());
        System.out.println(stream(a).sum());
        System.out.println(stream(a).count());
        System.out.println(stream(a).min().getAsInt());

        Object[] charArray = stream(a).mapToObj(i -> (char) i).toArray();

        System.out.println(stream(a).mapToObj(i -> (char) i).map(String::valueOf).map(String::toUpperCase).collect(Collectors.joining()));


        /**
         * Converting Integer array to List
         *
         * */
        List<Integer> aList = stream(a).boxed().collect(Collectors.toList());


        /**
         * Converting Integer array to List
         *
         * */
        ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);

        Set<Integer> aset = Arrays.stream(a).boxed().collect(Collectors.toSet());

        /** Returns a stream of Uniqe elements*/
        System.out.println(Arrays.stream(a).distinct());


//        Arrays.stream(a).map(Comparator::comparingInt).max()

    }
}
