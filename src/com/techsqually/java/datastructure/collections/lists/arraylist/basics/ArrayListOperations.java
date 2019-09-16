package com.techsqually.java.datastructure.collections.lists.arraylist.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListOperations {

     public static List<String> parameters ;

    public static void main(String[] args) {


        List<String> alist = new ArrayList<>(Arrays.asList("Arpan","Senorita","Sanjay","Pranjay","Sanjay"));
        List<String> blist = new ArrayList<>(Arrays.asList("Arpan","Senorita","Sanjay","Kiran"));

        ArrayList<String> acloneList = (ArrayList<String>) ((ArrayList<String>) alist).clone();

        System.out.println(alist.contains("Arpan"));

        System.out.println(alist.isEmpty());

        /**Returns the sub list*/
        alist.subList(2, 3);

        String[] array = (String[]) alist.toArray();



        System.out.println(Arrays.asList(acloneList));
        ((ArrayList<String>) alist).ensureCapacity(10);
        System.out.println(Arrays.asList(alist));

        System.out.println(alist.lastIndexOf("Sanjay"));
        //Index of first occurance of Object passed, It's case sensitive if the object is not found returns -1
        System.out.println(alist.indexOf("Sanjay"));

        //Remove all elements of blist from alist
        boolean removeAllList = alist.removeAll(blist);
        System.out.println(Arrays.asList(alist));

        List<String> elist = new ArrayList<>(Arrays.asList("Arpan","Senorita","Sanjay","Pranjay","Sanjay"));

        //E-list will contain all the all the elements that are common in the list and will remove
        elist.retainAll(blist);
        System.out.println(Arrays.asList(elist));

        Iterator<String> listiterator = blist.listIterator(2);
        Iterator<String> iterator = blist.iterator();


        /** Difference BETWEEN LIST ITERATOR AND ITERATOR
         *
         blist.listIterator() - Methods
         blist.listIterator().previous()
         blist.listIterator().previousIndex()
         blist.listIterator().hasPrevious()
         blist.listIterator().next()
         blist.listIterator().nextIndex()
         blist.listIterator().hasNext()
         blist.listIterator().add("");
         blist.listIterator().set("");*/

      /*
        blist.iterator().next()
        blist.iterator().hasNext()
        blist.iterator().remove();
        */


        while(iterator.hasNext()){
             System.out.println(iterator.next());
        }

        //SubList including the indexes
        List<String> flist = blist.subList(1,4);
        System.out.println(Arrays.asList(flist));

        System.out.println(Arrays.asList(flist.toArray()));

        blist.stream()
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);



        //To get the length of each element in the List
        blist.stream()
                .filter(s -> s.startsWith("S")).map(String::length).forEach(System.out::println);

        parameters = new ArrayList<>();

        //To filter out specific condition data from a List
        blist.stream()
                .filter(s -> s.startsWith("S")).map(String::toUpperCase).forEach(s -> {

            parameters.add(s);
        });

        System.out.println(Arrays.asList(parameters));


        //Leaves the last Index
        IntStream.range(1, 4)
                .forEach(System.out::println);


    }
}
