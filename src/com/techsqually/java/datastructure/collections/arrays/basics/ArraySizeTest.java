package com.techsqually.java.datastructure.collections.arrays.basics;

public class ArraySizeTest {

    public static void main(String[] args) {

        int[] a = new int[10]; // returns size = 10
        int[] a1 = {10, 11, 12}; //returns size = 3
        int[] a2 = {10, 11, 12, 1, 3}; // Returns size = 5
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;

        /*
         * Array size has nothing to do with the number of elements it holds
         * */
        System.out.println(a.length);
        System.out.println(a1.length);
        System.out.println(a2.length);
    }

}
