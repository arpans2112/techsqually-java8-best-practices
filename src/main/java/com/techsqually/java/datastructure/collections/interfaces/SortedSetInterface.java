package com.techsqually.java.datastructure.collections.interfaces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;

public class SortedSetInterface {

   /**
    * 1. SortedSet Interface implements Set Interface
    * 2. first() , last(),  headSet(E end) - Returns sortedSet , tailSet(E start) - returns set
    *    subSet(E start, E end)
    * 3.
    *
    *
    * */

   public static void main(String[] args) {

       SortedSet<Integer> abc = (SortedSet<Integer>) new HashSet<Integer>();
       abc.addAll(Arrays.asList(1,2,3,4,5));
       System.out.println(abc.headSet(2));;

   }

}
