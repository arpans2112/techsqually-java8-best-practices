package com.techsqually.datastructure.collections.queue.deque;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDequeBasics {
/*
* 1. Deque can have duplicate elements
* 2. Deque maintains the insertion order
* 3. Deque has stream funtion
*
*
* */

    private static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {

       //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
        addingElement(1);
        addingElement(2);
        addingElement(2);
        addingElement(4);
        addingElement(3);
        System.out.println(deque);

       int count = (int)deque.stream().collect(Collectors.toList()).subList(0,3).stream().distinct().count();
        System.out.println(count);

        /*Array Print out*/
        System.out.println(Arrays.toString(dequeToArray(deque)));

        /*List Print out*/
        System.out.println(dequeToList(deque));

        /*getSubList*/


        System.out.println(dequeToSubList(deque,0,3));

       int uniqe = (int) dequeToSubList(deque,0,3).stream().distinct().count();

        /*
        * Adding queue to HashSet
        * */
         HashSet<Integer> abc = new HashSet<>();
         abc.addAll(deque);
        System.out.println(abc);



    }

    public static Deque addListToDeque(List list){
        Deque<Integer> abc = new ArrayDeque<>();
        abc.addAll(list);
        return abc;
    }

    /*
    * getList
    * */
    public static List dequeToList(Deque deque){

        return (List) deque.stream().collect(Collectors.toList());
    }

    /*
    * Get Sub List
    * */

    public static List dequeToSubList(Deque deque,int startIndexInclusive, int endIndexExclusive){
        return dequeToList(deque).subList(startIndexInclusive, endIndexExclusive);
    }



    /*
    * Converting given deque into an Array
    *
    * */

    public static int[] dequeToArray(Deque deque){

       return deque.stream().mapToInt(i -> (int) i).map(Integer::valueOf).toArray();
    }

    public static Deque addingElement(int element){

        deque.add(element);
         return deque;

    }

    public static Deque removeElement(int element){

        deque.remove(element);
        return deque;
    }

    public static Deque removeFirstElement(){
        deque.removeFirst();
        return deque;
    }

    public static Deque removeFirstOccurrence(Object element){
        deque.removeFirstOccurrence(element);
        return deque;

    }


    public static Deque<Integer> getDeque() {
        return deque;
    }
}
