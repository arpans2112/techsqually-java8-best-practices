package com.techsqually.java.problemSolving.array;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingtheLeaderboard {

    public static void main(String[] args) {


        int[] leaderBoard = {100, 90, 90, 80, 75, 60};
        int[] aliceScores = {50, 65, 77, 90, 102};

        System.out.println(Arrays.toString(climbingLeaderboardLowPerformance(leaderBoard, aliceScores)));
        System.out.println(Arrays.toString(climbingLeaderboardHighPerformance(leaderBoard, aliceScores)));
        System.out.println(Arrays.toString(climbingLeaderboardLowPerformance1(leaderBoard, aliceScores)));

    }


    static int[] climbingLeaderboardLowPerformance(int[] scores, int[] alice) {

        int[] aliceRanks = new int[alice.length];

        TreeSet<Integer> scoreSet = new TreeSet<>();
        scoreSet.addAll(Arrays.stream(scores).boxed().collect(Collectors.toSet()));

        for (int i = 0; i < alice.length; i++) {
            scoreSet.add(alice[i]);
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(scoreSet);
            aliceRanks[i] = (list.size() - list.indexOf(alice[i]));
        }

        return aliceRanks;
    }


    static int[] climbingLeaderboardLowPerformance1(int[] scores, int[] alice) {

        int[] aliceRanks = new int[alice.length];

        TreeSet<Integer> scoreSet = new TreeSet<>();
        Arrays.stream(scores).distinct().boxed().forEach(i -> scoreSet.add(i));


        for (int i = 0; i < alice.length; i++) {
            scoreSet.add(alice[i]);
//            int rankFromLast = Collections.binarySearch(scoreSet.stream().collect(Collectors.toList()),alice[i]);
            int rankFromLast = Collections.binarySearch(scoreSet.stream().collect(Collectors.toList()), alice[i]);
            aliceRanks[i] = (scoreSet.size() - rankFromLast);
        }

        return aliceRanks;
    }


    static int[] climbingLeaderboardHighPerformance(int[] scores, int[] alice) {

        int[] aliceRanks = new int[alice.length];

        TreeSet<Integer> scoreSet = new TreeSet<>();
        scoreSet.addAll(Arrays.stream(scores).boxed().collect(Collectors.toSet()));

        int j = 0;
        int k = 0;

        for (Integer i : alice) {
            scoreSet.add(i);

            Iterator<Integer> itr = scoreSet.descendingIterator();
            while (itr.hasNext()) {
                k++;
                if (itr.next() == i) {
                    aliceRanks[j++] = k;
                    k = 0;
                    break;
                }
            }
        }

        return aliceRanks;
    }

}
