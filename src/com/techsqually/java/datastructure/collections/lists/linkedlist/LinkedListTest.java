package com.techsqually.java.datastructure.collections.lists.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListTest {


    public static void main(String[] args) {

        /**
         * POINTS TO BE NOTED ABOUT THE LINKED LIST
         *
         * 1. add and Remove funtion act as queue in the LinkedList
         * 2. pop and push funtions as as stack in the LinkedList
         * 3. poll remove element from the top and returns the element
         * 4. pollLast()/PollFirst()
         * 5. getLast()/getFirst();
         * 6. peekLast()/peekFirst();
         * 7. peek() returns the first element works as getFirst()
         *
         * */

        LinkedList<Integer> linkedList = getLinkedList();


        System.out.println(linkedList);
        /*adding element in the Last(Queue Funtion)*/
        linkedList.add(6);
        System.out.println(linkedList);

        /*Removing Element from the Top*/
        linkedList.remove();
        System.out.println(linkedList);


        linkedList.getFirst();
        System.out.println("linkedList.getFirst() : " + linkedList.getFirst());
        linkedList.getLast();
        System.out.println("linkedList.getLast() : " + linkedList.getLast());

        System.out.println("linkedList.peek() : " + linkedList.peek());
        linkedList.peekFirst();
        System.out.println("linkedList.peekFirst() : " + linkedList.peekFirst());
        System.out.println("linkedList.peekLast() : " + linkedList.peekLast());

        /*Remove Element from the start and return the element*/
        System.out.println("linkedList.poll() : " + linkedList.poll());
        System.out.println(linkedList);


        System.out.println("linkedList.pollFirst() : " + linkedList.pollFirst());
        System.out.println(linkedList);

        System.out.println("linkedList.pollLast() : " + linkedList.pollLast());
        System.out.println(linkedList);


        /*Below method work as a stacks in a Linked List*/
        /*Remove element from the top*/
        linkedList.pop();
        System.out.println(linkedList);

        /*add element to the top*/
        linkedList.push(7);
        System.out.println(linkedList);


//        System.out.println(getSubList(getLinkedList(),0,3));
    }

    public static List getSubList(LinkedList<Integer> givenList, int startIndexInclusive, int endIndexExclusive){

        return givenList.stream().collect(Collectors.toList()).subList(startIndexInclusive,endIndexExclusive);
    }

    public static LinkedList getLinkedList() {

        return new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }



}
