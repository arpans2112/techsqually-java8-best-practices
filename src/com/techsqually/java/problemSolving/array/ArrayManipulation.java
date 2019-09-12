package com.techsqually.java.problemSolving.array;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {


        int[][] queries = {
                /* {1, 5, 3},
                 {4, 8, 7},
                 {6, 9, 1},*/

                {2, 3, 603},
                {1, 1, 286},
                {4, 4, 882}

        };


        System.out.println(arrayManipulation(4, queries));

         
    }

    static long arrayManipulation(int n, int[][] queries) {
        long[] array = new long[n];

        for (int row = 0; row < queries.length; row++) {

            int startIndex = queries[row][0] - 1;
            int endIndex = queries[row][1] - 1;
            //   int endIndex = queries[row][1];
            int value = queries[row][2];

            for (int i = startIndex; i < endIndex + 1; i++) {
                array[i] += value;
            }
        }

        Arrays.sort(array);
        return array[n - 1];
    }
}
