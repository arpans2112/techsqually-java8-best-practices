package com.techsqually.java.problemSolving;

import java.util.Arrays;

public class CandyDisbtribution {

    public static void main(String[] args) {


        int candies = 7;
        int childerns = 4;
        int[] childernArray = new int[childerns];

        int candiesLeftOver = candies;
        int totalDistributedCandies=0;
        int candyForChild = 1;

        while(candiesLeftOver > 0){

            for(int i = 0 ; i< childernArray.length; i++){
                if (candiesLeftOver < candyForChild){
                    childernArray[i] = childernArray[i] + candiesLeftOver;
                    break;
                }else {
                    childernArray[i] = childernArray[i] + candyForChild;
                }
                totalDistributedCandies+=candyForChild;
                candyForChild++;
                candiesLeftOver = candies - totalDistributedCandies;
            }

            if (candiesLeftOver > childerns){
                candyForChild = childerns +1;
            }else{
                candyForChild = candiesLeftOver;
            }

        }
        System.out.println(Arrays.toString(childernArray));


    }
}
