package com.techsqually.java.datastructure.collections.queue.deque;


import sun.misc.Queue;

public class QueueTest {

    public static void main(String[] args) {


        //adding elements to queue
        Queue<Character> queue = new Queue<>();

        "arpan".chars().mapToObj(i -> (char) i).forEach(i -> {
            queue.enqueue(i);
        });

        try {
            System.out.println(queue.dequeue());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
