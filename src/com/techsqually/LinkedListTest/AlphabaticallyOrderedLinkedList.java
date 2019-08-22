package com.techsqually.LinkedListTest;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AlphabaticallyOrderedLinkedList {

    public static void main(String[] args) {

        LinkedList<String> placesToVist = new LinkedList<String>();
        addInOrder(placesToVist, "Ahemdabad");
        addInOrder(placesToVist, "Karnal");
        addInOrder(placesToVist, "Barrally");

        printList(placesToVist);


    }

    public static boolean addInOrder(LinkedList<String> placesTovisit, String newCity) {


        //Note : Now stringListIterator will serve as the reference of the list placesToVisit after you define the
        //ListIterator
        ListIterator<String> stringListIterator = placesTovisit.listIterator();

        while (stringListIterator.hasNext()) {

            int comparision = stringListIterator.next().compareTo(newCity);

            if (comparision == 0) {
                return false;
            } else if (comparision < 0) {

            } else if (comparision > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }

        }

        stringListIterator.add(newCity);
        return true;

    }

    public static void printList(LinkedList<String> placesTovisit) {

        Iterator<String> stringIterator = placesTovisit.iterator();

        while (stringIterator.hasNext()) {

            System.out.println(stringIterator.next());

        }

    }

}
