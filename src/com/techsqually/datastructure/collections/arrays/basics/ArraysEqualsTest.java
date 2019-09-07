package com.techsqually.datastructure.collections.arrays.basics;

import java.util.Arrays;

public class ArraysEqualsTest {


    public static void main(String[] args) {


        /*
         * To test if two arrays are equal or Not
         * */

        int[] a = {2, 3, 4};
        int[] b = {2, 3, 4};
        int[] c = new int[]{2, 3, 4};
        int[] d = new int[]{3, 4, 5};
        int[] e = new int[]{3, 4, 5};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(d, e));
    }

}
