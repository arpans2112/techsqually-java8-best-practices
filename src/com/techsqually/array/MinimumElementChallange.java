package com.techsqually.array;

public class MinimumElementChallange {

    public static void main(String[] args) {

        IntegerArrayUtility integerArrayUtility = new IntegerArrayUtility();
        int[] userDefinedArray = integerArrayUtility.userDefinedArray(5);
        int minmumValue = integerArrayUtility.minValueInArray(userDefinedArray);
        System.out.println("minmumValue = " + minmumValue);

    }
}
