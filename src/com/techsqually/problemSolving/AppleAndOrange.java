package com.techsqually.problemSolving;

import java.util.Arrays;

public class AppleAndOrange {


    public static void main(String[] args) {


        int s = 7 ;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};

        int applesInHouse = 0;
        int orangesInHouse = 0;

        applesInHouse =(int) Arrays.stream(apples).filter(i-> i+a >= s && i+a <= t ).count();
        orangesInHouse =(int) Arrays.stream(oranges).filter(i-> i+b >= s && i+b <= t ).count();

        System.out.println(applesInHouse + " " + orangesInHouse);



        }
}
