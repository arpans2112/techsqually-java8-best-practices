package com.techsqually.java.datastructure.collections.lists.arraylist.basics;

import java.util.*;
import java.util.stream.Collectors;

class LastNameCoparator implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {

        String lastName1 = o1.substring(o1.lastIndexOf(" "));
        String lastName2 = o2.substring(o2.lastIndexOf(" "));

        /**Compare by last name if last name is equal then compare by first Name*/
        int k = lastName1.compareTo(lastName2);
        return k == 0 ? o1.compareTo(o2) : k ;
    }
}

public class SortNameListWithLastName {

    public static void main(String[] args) {

        List<String> abc = new ArrayList<>(Arrays.asList(
                "Sumit Beniwal",
                "Arpan Beniwal",
                "Sanjay aadesh",
                "arpan cat"
        ));


    Collections.sort(abc,new LastNameCoparator());
      abc.forEach(i -> System.out.println(i));


        System.out.println(abc);

        TreeSet<String> treeSet = new TreeSet<>(new LastNameCoparator());
        treeSet.addAll(abc);

        treeSet.forEach(i -> System.out.println(i));


    }


}
