package com.techsqually.java.datastructure.collections.arrays.algorithms;

public class IntegerArrayTest {

    public static void main(String[] args) {

        //defining integer array
        int[] fixedLenghth = {1,2,3, 4, 5};

        //defining an array
        int[] fixedLenghth2 = new int[10];

        IntegerArrayUtility integerArrayUtility = new IntegerArrayUtility();

        System.out.println("Utility to Get an average of array");
        double average = integerArrayUtility.getAverage(fixedLenghth);
        System.out.println("average of give array : " + average);


        System.out.println("Utility to Print array");
        integerArrayUtility.printArray(fixedLenghth);

        System.out.println("sequence Array to add values to given array");
        int[] returnarray =  integerArrayUtility.sequenceArray(10,fixedLenghth2);
        integerArrayUtility.printArray(returnarray);


        int[] userdefinedarray = integerArrayUtility.userDefinedArray(5);
        System.out.println("Printing User Defined Array");
        integerArrayUtility.printArray(userdefinedarray);
    }

}
