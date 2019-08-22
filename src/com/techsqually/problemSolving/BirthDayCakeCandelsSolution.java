package com.techsqually.problemSolving;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class BirthDayCakeCandelsSolution {

    public static void main(String[] args) {

        int[] abc = new int[]{3 ,2, 1, 3};
        Arrays.parallelSort(abc);
        int candelsBlow = (int) Arrays.stream(abc).filter(i -> i== abc[abc.length-1]).count();
        System.out.println(candelsBlow);


    }
}
