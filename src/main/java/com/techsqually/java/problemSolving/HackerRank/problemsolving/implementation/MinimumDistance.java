package com.techsqually.java.problemSolving.HackerRank.problemsolving.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumDistance {

    public static void main(String[] args) {

        System.out.println( minimumDistances(new int[]{7 ,1 ,3 ,4 ,1, 7}));;

    }

    static int minimumDistances(int[] a) {

        List<Integer> alist = Arrays.stream(a).
                mapToObj(i -> i).
                collect(Collectors.toList());

        int minDistance = -1;

        for(int i =0 ; i < alist.size()-1; i++){

            int distance = Math.abs(alist.indexOf(alist.get(i)) - alist.lastIndexOf(alist.get(i)));


            if(distance != 0 &&  minDistance == -1){
                minDistance = distance;
            }else if(distance != 0 && distance < minDistance){
                minDistance =  distance;
            }
        }

        return minDistance;
    }
}
