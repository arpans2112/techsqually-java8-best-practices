package com.techsqually.java.datastructure.collections.interfaces;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

    /**
     * 1. Insertion order is maintained
     * 2. Add by defaults add the element in the last
     * 3. When a duplicate element is added in the set it returns false
     * 4. null value is allowed but only once
     * 5. implements collection interface
     *
     * */


    public static void main(String[] args) {

       Set<Integer> hashSet = new HashSet<>();
       boolean addElement = hashSet.add(1);
       boolean addElement2 = hashSet.add(2);
       hashSet.add(null);

       boolean addDuplicateElement = hashSet.add(1);

       System.out.println(addElement + " : "+ addDuplicateElement);
        System.out.println(hashSet);
    }
}
