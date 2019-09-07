package com.techsqually.java8Topics.library.stream.arraystream.objectArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectArrayConversionToList {


    public static void main(String[] args) {

        Element[] array = {new Element(1), new Element(2), new Element(3), new Element(2)};


        /*
         * Array To List Conversion
         * */
        List<Element> list = Arrays.stream(array).collect(Collectors.toList());

        /*
         * Array to Array List Conversion
         * */
        ArrayList<Element> arrayList = Arrays.stream(array)
                .collect(Collectors.toCollection(ArrayList::new));

        /*
         * Array to Linked List Conversion
         * */
        LinkedList<Element> linkedList = Arrays.stream(array)
                .collect(Collectors.toCollection(LinkedList::new));

        /*
         * Print List
         * */
        list.forEach(element -> {
            System.out.println(element.i);
        });


    }
}
