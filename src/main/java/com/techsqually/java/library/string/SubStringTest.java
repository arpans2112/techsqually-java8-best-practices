package com.techsqually.java.library.string;

public class SubStringTest {
    public static void main(String[] args) {

        String name = "arpan";
        System.out.println(name.substring(0,0));
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(name.length()));
//        System.out.println(name.substring(-2)); Not allowed
//        System.out.println(name.substring(name.length(),-2)); // Not allowed
//        System.out.println(name.substring(name.length(),2)); // Not allowed

    }
}
