package com.techsqually.java.datastructure.collections.arrays.basics;

public class TwoDimentionalArray {


    public static void main(String[] args) {

        int[][] twod = twoDimentionalArrayWithData();

        //Returns numberOfRows of a two dimensional array
        int totalNumberOfRows = twod.length;

        printTwoDimentionalArray(twoDimentionalArrayWithData());


    }


    public static void printTwoDimentionalArray(int[][] givenTwoDArray) {


        for (int row = 0; row < givenTwoDArray.length; row++) {

            for (int col = 0; col < givenTwoDArray[row].length; col++) {

                System.out.print(givenTwoDArray[row][col] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] twoDimentionalArrayWithData() {

        /**Below are only two ways of declaration of two dimensional array*/

        /**Declaration of two dimensional array in single line*/
        int[][] twoDimentionalArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };


        /**
         *   two dimensional array declaration of unequal columns
         *   int[][] twoDimentionalArray = new int[6][];
         *
         *   int[] givenArray1 = {1};
         *   int[] givenArray2 = {0, 1};
         *   int[] givenArray3 = {1, 1, 1};
         *   int[] givenArray4 = {0, 0, 2, 4};
         *   int[] givenArray5 = {0, 0, 0, 2, 0};
         *   int[] givenArray6 = {0, 0, 1, 2, 4, 0};
         */

        /**
         * two dimentional array declaration of equal rows and columns
         */
        /* int[][] twoDimentionalArray = new int[6][6];*/
        /* int[] givenArray1 = {1, 1, 1, 0, 0, 0};*/
        /* int[] givenArray2 = {0, 1, 0, 0, 0, 0};*/
        /* int[] givenArray3 = {1, 1, 1, 0, 0, 0};*/
        /* int[] givenArray4 = {0, 0, 2, 4, 4, 0};*/
        /* int[] givenArray5 = {0, 0, 0, 2, 0, 0};*/
        /* int[] givenArray6 = {0, 0, 1, 2, 4, 0};*/

        /* twoDimentionalArray[0] = givenArray1;*/
        /* twoDimentionalArray[1] = givenArray2;*/
        /* twoDimentionalArray[2] = givenArray3;*/
        /* twoDimentionalArray[3] = givenArray4;*/
        /* twoDimentionalArray[4] = givenArray5;*/
        /* twoDimentionalArray[5] = givenArray6;*/

        return twoDimentionalArray;

    }
}
