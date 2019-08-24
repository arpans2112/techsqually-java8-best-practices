package com.techsqually.datastructure.collections.arrays.algorithms;

import java.util.Scanner;

public class IntegerArrayUtility {


    public double getAverage(int[] array) {
        int sum = 0;

        for (int anArray : array) {
            sum += anArray;
        }
        return (double) sum / (double) array.length;
    }

    public void printArray(int[] array) {

        for (int anArray : array) {
            System.out.println(anArray);
        }
    }




    public int[] sequenceArray(int startValue, int[] array) {
        for (int j = 0; j < array.length; j++) {
            array[j] = startValue + j;
        }
        return array;
    }


    public int[] sequenceArray(int startValue, int sizeOfAnArray) {

        int[] array = new int[sizeOfAnArray];

        for (int j = 0; j < array.length; j++) {
            array[j] = startValue + j;
        }
        return array;
    }


    public int[] userDefinedArray(int size) {

        System.out.println("Enter any " + size + " Numbers to get an array of entered values: \r");
        Scanner scanner = new Scanner(System.in);
        int[] userdefinedarray = new int[size];
        for (int i = 0; i < userdefinedarray.length; i++) {
            userdefinedarray[i] = scanner.nextInt();
        }
        return userdefinedarray;
    }

    private int[] copyIntArray(int[] array) {

        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, copyArray.length);
        //  printArray(copyArray);
        return copyArray;
    }


    public int[] sortDescendingIntArray(int[] array) {

        int[] shortedArray = copyIntArray(array);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < shortedArray.length - 1; i++) {
                if (shortedArray[i] < shortedArray[i + 1]) {
                    temp = shortedArray[i];
                    shortedArray[i] = shortedArray[i + 1];
                    shortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return shortedArray;
    }

    public int[] sortAscendingIntArray(int[] array) {
        int[] shortedArray = copyIntArray(array);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < shortedArray.length - 1; i++) {
                if (shortedArray[i] > shortedArray[i + 1]) {
                    temp = shortedArray[i];
                    shortedArray[i] = shortedArray[i + 1];
                    shortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return shortedArray;
    }

    public int minValueInArray(int[] array) {

        int miniMumValue = array[0];

        for (int i = 1; i < array.length; i++) {

            if (miniMumValue > array[i]) {
                miniMumValue = array[i];
            }
        }

        return miniMumValue;
    }


    public int[] reverseIntArray(int[] array) {

        int[] reverseIntArray = array;
        int maxIndex = reverseIntArray.length - 1;
        int halfLength = reverseIntArray.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = reverseIntArray[i];
            reverseIntArray[i] = reverseIntArray[maxIndex - i];
            reverseIntArray[maxIndex - i] = temp;
        }
        return reverseIntArray;
    }


    public int[] resizedArray(int[] array, int increaseSizeBy) {

        int newArraySize = array.length + increaseSizeBy;
        if (newArraySize > array.length) {

            int[] resizedArray = new int[newArraySize];
            for (int i = 0; i < array.length; i++) {
                resizedArray[i] = array[i];
            }
            return resizedArray;
        } else {
            System.out.println("Resized Array can't be of smaller size");
            return array;
        }

    }
}
