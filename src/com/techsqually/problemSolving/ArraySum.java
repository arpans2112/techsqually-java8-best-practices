package com.techsqually.problemSolving;

public class ArraySum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int sum = 0;
         for(Integer i : arr){

             sum+=i;
         }

        System.out.println(sum);

    }
}
