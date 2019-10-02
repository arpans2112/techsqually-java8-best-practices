package com.techsqually.java.problemSolving.others;

import java.util.Scanner;

public class SumOfSubArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int subArrayOfNegativeSum = 0;
        int[] givenArray = new int[arraySize];

        //Adding elements to Array
        int index = 0;
        while (arraySize > 0) {
            givenArray[index] = sc.nextInt();
            index++;
            arraySize--;
        }

        //Sum of Subarrays who has negative sum
        int sum = 0;
        for (int startPoint = 0; startPoint < givenArray.length; startPoint++) {
            for (int group = startPoint; group <= givenArray.length; group++) {
                for (int j = startPoint; j < group; j++) {
                    sum += givenArray[j];
                }
                if (sum < 0) {
                    subArrayOfNegativeSum++;
                    sum=0;
                } else {
                    sum = 0;
                }
            }
        }

        System.out.println(subArrayOfNegativeSum);


    }

}
