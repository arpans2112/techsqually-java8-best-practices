package com.techsqually.java.datastructure.collections.maps.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.Entry.comparingByValue;

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


        TreeMap<Integer ,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,2);
        treeMap.put(2, 3);
        treeMap.put(4,2);


        int pairmaxkey = treeMap.entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey();
        int pair1value = treeMap.entrySet().stream().max(Map.Entry.comparingByKey()).get().getValue();
        int pairmaxvalue = treeMap.entrySet().stream().max(comparingByValue()).get().getValue();
        int keymaxvalue = treeMap.entrySet().stream().max(comparingByValue()).get().getKey();







         if (pairmaxkey > pairmaxvalue){

             System.out.println( pairmaxkey + ": " + pair1value);
         } else{

             System.out.println( pairmaxvalue + ": " + keymaxvalue);

         }


//       int maxKey = treeMap.keySet().stream();



    }

}
