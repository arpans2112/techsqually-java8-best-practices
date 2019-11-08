package com.techsqually.java.problemSolving.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CutTheSticks {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1})));
        System.out.println(Arrays.toString(cutTheSticks(new int[]{1, 1,1, 1})));
        System.out.println(Arrays.toString(cutTheSticks(new int[]{1 ,13, 3, 8, 14, 9, 4, 4})));

    }




    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {

       /**Sort given array*/


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int startIndex = 0;

        boolean firstTime = true;

        /**list of number of sticks in the begining of itteration*/
        ArrayList<Integer> intList = new ArrayList<>();

        /**we will repeat the process until the last element is */
        while (startIndex != arr.length - 1 && arr[arr.length-1] != 0)  {

            int minNumber = arr[startIndex];
            intList.add(arr.length - (startIndex));

            for (int i = startIndex; i < arr.length; i++) {
                arr[i] = arr[i] - minNumber;
                if (arr[i] != 0 && firstTime) {
                    startIndex = i;
                    firstTime = false;

                }
            }

            firstTime = true;

        }

        if (arr[arr.length-1] != 0)
            intList.add(1);

        int[] outArray = new int[intList.size()];
        IntStream.range(0,intList.size()).forEach(i -> outArray[i] = intList.get(i));

        return outArray;

    }




    }

