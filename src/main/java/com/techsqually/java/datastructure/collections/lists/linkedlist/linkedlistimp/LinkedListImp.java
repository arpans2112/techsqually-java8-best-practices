package com.techsqually.java.datastructure.collections.lists.linkedlist.linkedlistimp;

import java.util.LinkedList;

public class LinkedListImp {

    public static void main(String[] args) {

        System.out.println("Hi I'm in private main method");
        LinkedList<Integer> abc = new LinkedList<>();

        Node<Integer> newNode = new Node<Integer>(3);


    }

    static class Node<E> {

        E item;
        Node next;


        Node(E item) {

            this.item = item;
            this.next = null;
        }

        Node(E item, Node<E> newNode) {
            this.item = item;
            this.next = newNode;
        }


        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}

