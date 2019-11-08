package com.techsqually.java.problemSolving.HackerRank.problemsolving.implementation;

import java.util.stream.IntStream;

public class ViralAdvertising {


    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));
    }


    static int viralAdvertising(int n) {

        int profileSharedWith = 5;


        int cumulativeLikes = 0;

        for(int day = 1; day <= n; day++){

            int  likes=profileSharedWith/2;
            cumulativeLikes+=likes;
            profileSharedWith=(likes)*3;
        }

        return cumulativeLikes;

    }


}
