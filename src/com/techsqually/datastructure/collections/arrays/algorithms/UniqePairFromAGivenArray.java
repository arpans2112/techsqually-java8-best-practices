package com.techsqually.datastructure.collections.arrays.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import static com.techsqually.problemSolving.BigIntegerArray.sum;

public class UniqePairFromAGivenArray {

    public static String pair = "";
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 6, 1, 2};




        System.out.println(uniqePairsFromAGivenArray(arr));

//        //Operations on a pair of arrays
//        int pairsCount = (int)uniqePairsFromAGivenArray(arr).stream().map(pair -> pair.replace(":",""))
//                .filter( givenPair -> Character.getNumericValue(givenPair.charAt(0)) <= Character.getNumericValue(givenPair.charAt(1)) &&
//                        (Character.getNumericValue(givenPair.charAt(0)) + Character.getNumericValue(givenPair.charAt(1))) % 3 == 0
//                        ).count();
//
//        System.out.println(pairsCount);
    }



    public static HashSet uniqePairsFromAGivenArray(int[] givenArray){

        HashSet<String> uniquePairs = new HashSet<>();

        for(Integer i : givenArray){
            for(Integer j: givenArray){
                if (i < j){
                    pair = i + ":" + j;
                }else{
                    pair = j + ":" + i;
                }
                uniquePairs.add(pair);
            }
        }
        return uniquePairs;
    }
}
