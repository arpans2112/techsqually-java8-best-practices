package com.techsqually.datastructure.collections.arrays.algorithms;

public class HoureGlassSumofSixIntoSixArray {


    public static void main(String[] args) {


        int[][] givenArray = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5},
        };

        System.out.println(maxSumOfPossibleHoureGlasses(givenArray));

    }

    public static int maxSumOfPossibleHoureGlasses(int[][] givenArray){

        /*
        * Why we define it to min_value, because if we define it to zero and sum is always coming as negative number
        * maxSum value will never be set and it will fail for all such arrays, so to handel the negative sum values also
        * we define the maxSum to minimum value of Integer
        * */

        int maxSum = Integer.MIN_VALUE;
        for (int i =0 ; i < 4 ; i++){

            for (int j = 0 ; j < 4; j++){

            int sum = givenArray[i][j] + givenArray[i][j+1]+givenArray[i][j+2]+
                               givenArray[i+1][j+1]+
                      givenArray[i+2][j] + givenArray[i+2][j+1] + givenArray[i+2][j+2];

            if (sum > maxSum)  maxSum = sum;

            }

        }

        return maxSum;
    }


}
