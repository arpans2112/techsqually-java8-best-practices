package com.techsqually.datastructure.collections.arrays.algorithms;

import java.util.Arrays;

public class ReverseIntArrayChallange {

    public static void main(String[] args) {



        IntegerArrayUtility integerArrayUtility = new IntegerArrayUtility();
        int[] originalArray = integerArrayUtility.sequenceArray(1,5);
        System.out.println("Original Array : " +  Arrays.toString(originalArray));


        int[] reversedArray = integerArrayUtility.reverseIntArray(originalArray);
        System.out.println("Reversed Array Printing : " +  Arrays.toString(reversedArray));



    }
}
