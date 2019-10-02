package com.techsqually.java.problemSolving.others;

import java.math.BigInteger;
import java.util.Arrays;

public class MaximumAndMinimumInAnArray {


    public static void main(String[] args) {

        int[] givenArray = {256741038, 623958417, 467905213, 714532089, 938071625};
//        int[] givenArray = {1, 2, 3, 4, 5};
        getMinMaxBySorting(givenArray);
        getMinMaxByArraysMethods(givenArray);
//        getMinMaxByArraysMethods(givenArray);
        getSumOfArrayHavingOneLessElement(givenArray);
    }

    public static void getMinMaxBySorting(int[] givenArray){

//        Arrays.sort(givenArray);
        Arrays.parallelSort(givenArray);
        System.out.println(Arrays.toString(givenArray));
        //Sum can be bigger than integer so store in long variables
        long minimumSum=0;
        long maximumSum=0;
        for (int i=0 ; i< givenArray.length-1; i++){

            minimumSum+=givenArray[i];
        }

        for (int j=givenArray.length-1 ; j>0;j--){

            maximumSum+=givenArray[j];
        }

        System.out.println(minimumSum + " " +  maximumSum);

    }

    //Draw back of this method is if the sum of all the elements goes beyond the limit of long.Max value
    // it returns the incorrect value

    public static void getMinMaxByArraysMethods(int[] givenArray){

        BigInteger sumofArray = BigInteger.valueOf(Arrays.stream(givenArray).sum());

        BigInteger minimumValue = BigInteger.valueOf(Arrays.stream(givenArray).min().getAsInt());

        BigInteger MaxmumValue =  BigInteger.valueOf(Arrays.stream(givenArray).max().getAsInt());

        BigInteger minimumSum = sumofArray.subtract(MaxmumValue);
        BigInteger maximumSum = sumofArray.subtract(minimumValue);



        System.out.println(minimumSum + " " + maximumSum);

    }

    public  static void getSumOfArrayHavingOneLessElement(int[] givenArray){

        Arrays.parallelSort(givenArray);
        System.out.println(Arrays.toString(givenArray));

        BigInteger.valueOf(Arrays.stream(givenArray,0,givenArray.length-1).sum());
        BigInteger.valueOf(Arrays.stream(givenArray,1,givenArray.length-0).sum());


        System.out.println( BigInteger.valueOf(Arrays.stream(givenArray,0,givenArray.length-1).sum()) + " " +  BigInteger.valueOf(Arrays.stream(givenArray,1,givenArray.length-0).sum()));
    }

    }

