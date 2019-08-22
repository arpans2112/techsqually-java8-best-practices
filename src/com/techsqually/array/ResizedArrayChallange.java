package com.techsqually.array;

import java.util.Arrays;

public class ResizedArrayChallange {

    public static void main(String[] args) {

        IntegerArrayUtility integerArrayUtility = new IntegerArrayUtility();
        int[] sequenceArray = integerArrayUtility.sequenceArray(5 , 5);

        System.out.println(Arrays.toString(sequenceArray));

        int[] resizedArray = integerArrayUtility.resizedArray(sequenceArray, 2);
        System.out.println(Arrays.toString(resizedArray));


    }
}
