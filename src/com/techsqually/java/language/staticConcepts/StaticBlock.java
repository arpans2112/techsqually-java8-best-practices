package com.techsqually.java.language.staticConcepts;


/*
 * ABOUT STATIC BLOCKS AND CONSTRUCTOR EXECUTION
 * 1. if Multiple Static blocks are there, then they will execute in the order in which they are
 * defined in the class
 * 2. After execution of all the static blocks, then constructor of the class will be executed.
 * */

public class StaticBlock {

    static int a = 10;
    static int b;


    static {
        System.out.println("In in static block");

    }


    static {

        System.out.println("We are in second static block");
        b = a * 4;

    }


    StaticBlock() {
        System.out.println("I'm in the constructor!");
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(a);
        System.out.println(b);
    }
}
