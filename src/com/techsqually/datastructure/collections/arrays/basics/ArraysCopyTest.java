package com.techsqually.datastructure.collections.arrays.basics;

import java.util.Arrays;

public class ArraysCopyTest {

    public static void main(String[] args) {

        int[] a = {2, 3, 4};
        int[] b = {2, 3, 4};
        int[] c = new int[]{2, 3, 4};
        int[] d = new int[]{3, 4, 5};
        int[] e = new int[]{3, 4, 5};

        int[] f = new int[3];
        int[] k = new int[3];




        /*
         *  System.arraycopy();
         * */
        System.arraycopy(a, 0, f, 0, a.length);
        System.out.println(Arrays.toString(f));


        /*
         * Arrays:
         * */
        f = Arrays.copyOf(d, d.length);
        System.out.println(Arrays.toString(f));

    }


}
