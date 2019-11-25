package com.techsqually.java.problemSolving.HackerRank;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {


    public static void main(String[] args) {

        System.out.println(gradingStudents(new ArrayList<>(Arrays.asList(73, 67, 38, 33))));

    }


    public static List<Integer> gradingStudents(List<Integer> abc) {

        List<Integer> newGradeList = new ArrayList<Integer>();

        abc.forEach(grade -> {

            int round = 5 - grade % 5;

            int roundedGrade = round < 3 ? grade + round : grade;

            newGradeList.add(roundedGrade < 38 ? grade : roundedGrade);


        });


        return newGradeList;

    }
}
