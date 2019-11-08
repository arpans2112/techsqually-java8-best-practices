package com.techsqually.java.library.string;

public class equalsVsdoubleEquall {

    /**
     * difference between == and equals Method
     * */

    public static void main(String[] args) {

        String s1 =  "testingString";
        String s2 = new String(s1);

        System.out.println(s1.equals(s2)); // returns true as it compares the characters in the string
        System.out.println(s1 == s2); // returns false : as it compare characters and object reference


    }
}
