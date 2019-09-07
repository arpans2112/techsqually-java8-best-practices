package com.techsqually.java.problemSolving;

import java.util.Arrays;

public class PlusMinuSolution {


    public static void main(String[] args) {

        int[] givenArray = {-4, 3, -9, 0, 4, 1 };

        int negativeCount = (int) Arrays.stream(givenArray).filter(i -> i<0).count();
        int positiveCount = (int) Arrays.stream(givenArray).filter(i -> i>0).count();
        int zeroCount = (int) Arrays.stream(givenArray).filter(i -> i == 0).count();

        System.out.println(String.format("Negative number percentage:  %.6f",(double)positiveCount/givenArray.length));
        System.out.println(String.format("%.6f",(double)negativeCount/givenArray.length));
        System.out.println(String.format("%.6f",(double)zeroCount/givenArray.length));
    }
}
