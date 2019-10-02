package com.techsqually.java.companies.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UniqeElementsForWhichSumExistInArray {

    public static void main(String[] args) {

        int[] givenArray = {1, 2, 4, 5, 6, 8};
        checkUniqeSum(givenArray);

    }

    public static void checkUniqeSum(int[] givenArray) {

//        HashSet<Integer> uniqueValues = (HashSet<Integer>) Arrays.stream(givenArray).mapToObj(i -> i).collect(Collectors.toSet());
//        ArrayList<Integer> givenArrayList = (ArrayList<Integer>) Arrays.stream(givenArray).mapToObj(i ->  i).collect(Collectors.toList());

        HashSet<Integer> uniqueValues = (HashSet<Integer>) Arrays.stream(givenArray).mapToObj(i -> i).collect(Collectors.toSet());
        ArrayList<Integer> givenArrayList = (ArrayList<Integer>) Arrays.stream(givenArray).mapToObj(i ->  i).collect(Collectors.toList());



        HashSet<Integer> outPutHashSet = new HashSet<>();

        int sum;

        for (int startIndex = 0; startIndex < givenArrayList.size() - 1; startIndex++) {

            sum = givenArrayList.get(startIndex) + givenArrayList.get(startIndex + 1);

            if (uniqueValues.contains(sum)) {

                outPutHashSet.add(givenArrayList.get(startIndex));
                outPutHashSet.add(givenArrayList.get(startIndex + 1));


            }

        }

       int[] finalArray = outPutHashSet.stream().mapToInt(i -> i).toArray();
          System.out.println(Arrays.toString(finalArray));

    }

}
