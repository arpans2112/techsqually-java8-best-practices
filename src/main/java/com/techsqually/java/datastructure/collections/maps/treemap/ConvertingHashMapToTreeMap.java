package com.techsqually.java.datastructure.collections.maps.treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class ConvertingHashMapToTreeMap {

    public static void main(String[] args) {

        /**Declaring Map*/
        HashMap<String,Integer> newPhoneBook = new HashMap(){{
            putIfAbsent("Arpan",80186787);
            putIfAbsent("Anil",80186787);
            putIfAbsent("Sunil",80186787);
            putIfAbsent("Sanjay",80186788);
            putIfAbsent("Kiran",80186789);
            putIfAbsent("Pranjay",80186790);
            putIfAbsent("Jaiparkash",80186791);
            putIfAbsent("Maya",80186792);
            putIfAbsent("Rythem",80186793);
            putIfAbsent("Preeti",80186794);

        }};

        /**Converting HashMap to Tree Map for sorting keys*/
        TreeMap<String, Integer> treeMap = new TreeMap<>(newPhoneBook);
        treeMap.forEach((k,v) -> System.out.println(k + " : " + v));


        System.out.println("*****************");
        /**To get the map in reverse Order*/
        treeMap.descendingMap().forEach((k,v) -> System.out.println( k + " : " + v));


        /**Converting Tree map to Linked HashMap*/
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(treeMap.descendingMap());
        System.out.println(linkedHashMap);

    }
}
