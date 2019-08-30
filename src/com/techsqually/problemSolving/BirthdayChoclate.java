package com.techsqually.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChoclate {

    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>(Arrays.asList(1,2 ,1 ,3, 2));
//        System.out.println(birthday(s,3,2));

        System.out.println(birthDayChoclateDis(s,3,2));

    }


    public static int birthDayChoclateDis(List<Integer> s, int d, int m){

        int disStributionCount = 0;

        for (int startIndex  = 0 ; s.size() - startIndex >= m ; startIndex++){

            if (s.subList(startIndex,startIndex+m).stream().mapToInt(Integer::intValue).sum() == d){
                disStributionCount++;
            }

        }

        return disStributionCount;

    }



    static int birthday(List<Integer> s, int d, int m) {

        int sum = 0;
        int noOfWays=0;
        int startIndex = 0;

        for(int i = 0 ; i < s.size(); i++){

            int innerLoop = s.size()-startIndex >= m ? m :  s.size()-startIndex;
            for(int j = startIndex ; j < innerLoop ; j++ ) {

                sum+=s.get(j);
                if (j==m-1) startIndex = j;
            }

            if(d == sum){
                noOfWays++;
            }
            sum = 0;


        }
        return noOfWays;

    }
}
