package com.techsqually.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompareTwoLists {

    public static void main(String[] args) {

        List<Integer> alist = new ArrayList<>(Arrays.asList(4,5,6));
        List<Integer> blist = new ArrayList<>(Arrays.asList(1,7,6));

        int[] scoreArray = new int[2];
        int aliseScore = 0;
        int bobsScore = 0;
        if (alist.size() == blist.size()){

            for (int i =0 ; i < alist.size(); i++){

                if (alist.get(i) > blist.get(i)){
                    aliseScore++;
                }else if (alist.get(i) < blist.get(i)){

                    bobsScore++;
                }
            }

            scoreArray[0]=aliseScore;
            scoreArray[1]=bobsScore;

            System.out.println(Arrays.toString(scoreArray));



        }





    }
}
