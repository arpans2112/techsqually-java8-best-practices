package com.techsqually.datastructure.collections.lists.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListTest {


    public static void main(String[] args) {

        LinkedList<Integer> giveString = new LinkedList<>();
        giveString.add(1);
        giveString.add(2);
        giveString.add(3);
        giveString.add(4);
        giveString.add(3);
        giveString.add(5);

        System.out.println(giveString);
        System.out.println(getSubList(giveString,0,3));
    }

    public static List getSubList(LinkedList<Integer> givenList, int startIndexInclusive, int endIndexExclusive){

        return givenList.stream().collect(Collectors.toList()).subList(startIndexInclusive,endIndexExclusive);
    }
}
