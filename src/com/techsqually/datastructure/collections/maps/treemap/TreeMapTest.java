package com.techsqually.datastructure.collections.maps.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        Map<Integer ,String> abc = new TreeMap<>();
        abc.put(2,"Arpan");
        abc.put(1, "Udit");
        abc.put(3,"Sanjay");


        Map<String ,String> stringSort = new TreeMap<>();
        stringSort.put("Udit","Arpan");
        stringSort.put("Arpan", "Udit");
        stringSort.put("Sanjay","Sanjay");


        /* it sort the elements based on the keys
        * {1=Udit, 2=Arpan, 3=Sanjay} , {Arpan=Udit, Sanjay=Sanjay, Udit=Arpan}
        * */

        System.out.println(abc);
        System.out.println(stringSort);

    }

}
