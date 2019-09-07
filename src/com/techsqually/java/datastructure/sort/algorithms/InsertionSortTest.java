package com.techsqually.java.datastructure.sort.algorithms;

public class InsertionSortTest {

    public static void main(String[] args) {

       // Given Array
        int[] givenArray = {2,9,7,4,3,8,6,5,1,10};



        for (int firstUnsortedIndex = 1 ; firstUnsortedIndex < givenArray.length; firstUnsortedIndex++){

            int newElement = givenArray[firstUnsortedIndex];
            int insertIndex = firstUnsortedIndex;

           for(int j = firstUnsortedIndex-1; j >= 0 ; j--){

               if (newElement < givenArray[j]){
                   givenArray[insertIndex] = givenArray[j];
                   insertIndex--;
               }
               givenArray[insertIndex] = newElement;
           }
        }


        for (Integer i : givenArray){
            System.out.println(i);
        }
    }
}
