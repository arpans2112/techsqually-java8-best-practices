package com.techsqually.datastructure.collections.arrays.algorithms;

import java.util.*;

public class StepGameWinLoose {


    public static void main(String[] args) {

        int[] giveArray = {0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0};
//          int[] giveArray =  {0, 0, 0, 0, 0, 0,0};
//          int[] giveArray =  {0, 0, 1, 1, 1, 0};
//          System.out.println(isSolvable(18,giveArray,0) ? "Yes" : "No");;
          System.out.println(withoutRecursion(18,giveArray) ? "Yes" : "No");;


    }

    public static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1)
        {
            return false;
        }
        if ((i == arr.length - 1) || i + m > arr.length - 1){
            return true;
        }
        arr[i] = 1;

        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);

    }


    /*
    * Below solution is not working, Need to check why
    * */
    public static boolean withoutRecursion(int m, int[] arr){

        int startIndex = 0;

        boolean gameRunner = true;

        while(gameRunner){

            arr[startIndex] = 1;
//            if (startIndex < 0 || arr[startIndex] == 0)
//            {
//                  arr[startIndex] = 1;
//            }

            if ((startIndex == arr.length - 1) || startIndex + m > arr.length - 1) return true;


            if (arr[startIndex+1] == 0){
                startIndex++;
                continue;
            }else if (arr[startIndex-1] == 0){
                startIndex--;
                continue;
            }else if (arr[startIndex+m] == 0){
                startIndex+=m;
                continue;
            }else{
                break;
            }
        }
        return false;

    }


}

