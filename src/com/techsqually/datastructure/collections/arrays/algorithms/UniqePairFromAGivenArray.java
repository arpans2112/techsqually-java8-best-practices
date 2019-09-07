package com.techsqually.datastructure.collections.arrays.algorithms;

import java.util.HashSet;

public class UniqePairFromAGivenArray {

    public static String pair = "";
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 6, 1, 2};


        System.out.println(uniqePairsFromAGivenArray(arr));
        System.out.println(uniquePairs(arr));

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
                pair = i < j ? i + ":" + j : j + ":" + i;
                uniquePairs.add(pair);
            }
        }
        return uniquePairs;
    }


    //Less complexity than above method
    public static HashSet uniquePairs(int[] giveArray) {

        HashSet<String> uniqePairs = new HashSet<>();
        for (int i = 0; i < giveArray.length; i++) {
            for (int j = i; j < giveArray.length; j++) {

                String element = giveArray[i] < giveArray[j] ? (giveArray[i] + ":" + giveArray[j]) : (giveArray[j] + ":" + giveArray[i]);
                uniqePairs.add(element);
            }
        }
        return uniqePairs;
    }
}
