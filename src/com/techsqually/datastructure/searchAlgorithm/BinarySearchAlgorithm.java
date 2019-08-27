package com.techsqually.datastructure.searchAlgorithm;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {


        int[] givenArray = {-22,-15,1,7,20,35,25};

        System.out.println("Index of value : " + binarySearchAlgo(givenArray,1));
        System.out.println("Index of value : " + recursiveBinarySearch(givenArray,0,givenArray.length,1));
    }


    public static int binarySearchAlgo(int[] givenArray, int value){

        int startPoint = 0;
        int endPoint = givenArray.length;

        while(startPoint < endPoint){

            int midpoint = (startPoint + endPoint)/2;

            if (givenArray[midpoint] == value){

                return midpoint;
            }else if(givenArray[midpoint] > value ){
                endPoint = midpoint;
            }else {
                startPoint = midpoint +1;
            }

        }

        //When the element is not found
        return -1;

    }


    /*
    *
    * Recursive Search algorithm
    *
    * */
    public static int recursiveBinarySearch(int[] givenarray, int start, int end, int value){

        if (start >= end){
            return -1;
        }

        int midpoint = (start + end)/2;

        if (givenarray[midpoint] == value){
            return midpoint;
        }else if(givenarray[midpoint] > value ){

            return recursiveBinarySearch(givenarray, start, midpoint,value);
        }else {

            return recursiveBinarySearch(givenarray, midpoint +1, end, value);
        }

    }
}
