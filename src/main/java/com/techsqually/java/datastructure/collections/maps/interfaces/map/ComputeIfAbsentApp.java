package com.techsqually.java.datastructure.collections.maps.interfaces.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ComputeIfAbsentApp {

    public static void main(String[] args) {

        /** if you have to do some operation when the value already present or Not present in the map*/

        whenKeyNotPresent();
        whenKeyAlreadyPresent();

    }

    public static void whenKeyAlreadyPresent(){

        // create a HashMap and add some values
        HashMap<Integer, String>
                map = new HashMap<>();
        map.put(10, "Aman");
        map.put(20, "Suraj");
        map.put(30, "Harsh");

        // print map details
        System.out.println("HashMap:\n"
                + map.toString());

        // provide value for new key which is absent
        // using computeIfAbsent method
        map.computeIfAbsent(40, k -> "Sanjeet");

        // this will not effect anything
        // because key 1 is present
        map.computeIfAbsent(10, k -> "Amarjit");

        // print new mapping
        System.out.println("New HashMap:\n" + map);

    }

    public static void whenKeyNotPresent(){

        // create a HashMap and add some values
        HashMap<String, Integer> map
                = new LinkedHashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);

        // print map details
        System.out.println("LinkedHashMap:\n "
                + map.toString());

        // provide value for new key which is absent
        // using computeIfAbsent method
        map.computeIfAbsent("key5",
                k -> 2000 + 33000);
        map.computeIfAbsent("key6",
                k -> 2000 * 34);

        // print new mapping
        System.out.println("New LinkedHashMap:\n "
                + map);


    }

}
