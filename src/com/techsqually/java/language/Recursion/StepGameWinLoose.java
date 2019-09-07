package com.techsqually.java.language.Recursion;

public class StepGameWinLoose {

    /*
    *
    * Multiple Recursion example
    * */


    public static void main(String[] args) {

        int[] giveArray = {0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0};
//          int[] giveArray =  {0, 0, 0, 0, 0, 0,0};
//          int[] giveArray =  {0, 0, 1, 1, 1, 0};
        System.out.println(isSolvable(18, giveArray, 0) ? "Yes" : "No");


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

}

