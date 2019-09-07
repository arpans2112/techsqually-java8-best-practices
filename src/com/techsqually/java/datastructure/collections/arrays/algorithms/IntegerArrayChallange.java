package com.techsqually.java.datastructure.collections.arrays.algorithms;

public class IntegerArrayChallange {

    public static void main(String[] args) {

        IntegerArrayUtility integerArrayUtility = new IntegerArrayUtility();
        int[] userdefinedarray = integerArrayUtility.userDefinedArray(5);

        //printing Decending array
        int[] decendingsortedArray = integerArrayUtility.sortDescendingIntArray(userdefinedarray);
        System.out.println("Printing decending Sorted Array");
        integerArrayUtility.printArray(decendingsortedArray);

       //printing Ascending array
        int[] accendingSortedArray = integerArrayUtility.sortAscendingIntArray(userdefinedarray);
        System.out.println("Printing Accending Sorted Array");
        integerArrayUtility.printArray(accendingSortedArray);

    }

}
