package com.techsqually.java.companies.amazon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LightActiveInactive {

    public static void main(String[] args) {


        System.out.println(light(new int[]{1,0,0,0,0,1,0,0} , 1));
        System.out.println(light(new int[]{1,1,1,0,1,1,1,1} , 2));



    }


    public static List<Integer> light(int[] givenArray, int days){

        int[] updatedArray = new int[givenArray.length];
        System.arraycopy(givenArray,0,updatedArray,0,givenArray.length);


             while(days > 0){

                 for (int i = 0 ; i < givenArray.length ; i++){

                     int leftValule = i -1 < 0 ? 0 : givenArray[i-1];
                     int rightValule = i == givenArray.length-1 ? 0 : givenArray[i+1];
                     int midValue = givenArray[i];

                     if(leftValule == rightValule){
                         updatedArray[i] = 0;
                     }else {

                         updatedArray[i] = 1;
                     }

                 }

                 System.arraycopy(updatedArray,0,givenArray,0,givenArray.length);
                 days--;

             }

             return Arrays.stream(updatedArray).mapToObj(i -> i).collect(Collectors.toList());


    }


}
