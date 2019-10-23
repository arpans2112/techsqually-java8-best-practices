package com.techsqually.java.datastructure.collections.sets.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Itterator {

    public static void main(String[] args) {

        Set<String> abc = new HashSet<>(Arrays.asList("Arpan","Ramit","Sanjay"));
        Iterator<String> xyz = abc.iterator();

        while(xyz.hasNext()){
            System.out.println(xyz.next());


        }



    }
}
