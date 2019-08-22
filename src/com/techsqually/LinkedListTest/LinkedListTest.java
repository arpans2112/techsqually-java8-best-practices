package com.techsqually.LinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String args[]){

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add(2,"Arpan");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");
        al2.add("Junaid");
        al2.add(2,"Arpan");

        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);
    }
}
