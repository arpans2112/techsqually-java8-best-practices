package com.techsqually.java.problemSolving.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {


    public static void main(String[] args) {


        List<Integer> grades = new ArrayList<>(Arrays.asList(73,67,38,33));

        List<Integer> finalGrades = new ArrayList<>();

        grades.forEach(i -> {
            if (i < 38){
                finalGrades.add(i);
            }else {
                finalGrades.add(i%5 < 3 ? i : i + (5 -  i%5));
            }
        });

        System.out.println(finalGrades);

    }
}
