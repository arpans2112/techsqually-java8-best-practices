package com.techsqually.java.problemSolving.array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindLeadersInAGivenList {


    public static void main(String[] args) {

        int[] given = {14, 9, 11, 7, 8, 5, 3};


        ArrayList<Integer> leadersList = new ArrayList<>();
        for (int i = 0; i < given.length - 1; i++) {
            if (given[i] > Arrays.stream(given, i + 1, given.length).max().getAsInt())
                leadersList.add(given[i]);
        }

        System.out.println(leadersList);

        System.out.println(Arrays.toString(given));

    }
}
