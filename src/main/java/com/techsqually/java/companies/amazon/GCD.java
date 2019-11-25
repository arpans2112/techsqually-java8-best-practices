package com.techsqually.java.companies.amazon;

import java.util.Arrays;

public class GCD {

    public static int index ;
    public static void main(String[] args) {


        System.out.println(gcd());

    }


    public static int gcd(){


       int[] givenArray1 = {12,15, 27,84};

       int minValue = Arrays.stream(givenArray1).min().getAsInt();


       int gcd = 1;
       int count = 0;
       for (index = 2 ; index <= minValue /2; index++){
            count = (int) Arrays.stream(givenArray1).mapToObj(i -> i).filter(i -> i % index != 0).count();
           if (count == 0) {
               gcd = index;
           }
       }

        count = (int) Arrays.stream(givenArray1).mapToObj(i -> i).filter(i -> i % minValue != 0).count();
        if (count == 0) gcd = minValue;
       return gcd;

    }

}
