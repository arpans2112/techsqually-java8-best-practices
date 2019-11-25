package com.techsqually.java.datastructure.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapBasedOnKeysAndValues {


    public static void main(String[] args) {


        HashMap<String,Integer> newPhoneBook = new HashMap(){{
            putIfAbsent("Arpan",80186787);
            putIfAbsent("Sanjay",80186788);
            putIfAbsent("Kiran",80186789);
            putIfAbsent("Pranjay",80186790);
            putIfAbsent("Jaiparkash",80186791);
            putIfAbsent("Maya",80186792);
            putIfAbsent("Rythem",80186793);
            putIfAbsent("Preeti",80186794);
            putIfAbsent("Adarsh",80186787);

        }};

        /**Sort Map based on Keys*/

     Map<String,Integer> sortedMap =   newPhoneBook.entrySet().
                                        stream().sorted().
                                        collect(Collectors.toMap(k -> k.getKey() , v -> v.getValue()));
        System.out.println(sortedMap);

    }
}
