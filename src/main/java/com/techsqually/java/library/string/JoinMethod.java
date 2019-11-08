package com.techsqually.java.library.string;

public class JoinMethod {

    public static void main(String[] args) {

        String[] array = {"arpan","sanjay","kiran"};
        /** Joining different words with dilimeter*/

        System.out.println(String.join(" ",array));
        System.out.println(String.join(",",array));
        System.out.println(String.join(":",array));

    }
}
