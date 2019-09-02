package com.techsqually.java8Topics.binary;

import java.util.Arrays;

public class DecimalToBinaryConversion {

    public static String binaryString = "";
    /*
    * Convert given decimal number to Binary number and then find the maxium number
    * of Consecutive 1 in the binary number
    *
    * */

    public static void main(String[] args) {

        System.out.println(decimalToBinary(5));
        System.out.println(decimalToBinaryNumber(8));

       String[] arrayOfConsecutiveOnes = decimalToBinaryNumber(8).split("0");
       int maxConsecutiveOne = Arrays.stream(arrayOfConsecutiveOnes).map(String::length).max(Integer::compareTo).get().intValue();

        System.out.println(maxConsecutiveOne);

        System.out.println(decimalToBinaryWithoutFuntion(5));

        decimalToBinaryUsingRecursion(5);

        System.out.println(binaryString);


    }

    public static String decimalToBinaryNumber(int n){

        return Integer.toBinaryString(n);
    }

    public static String decimalToBinary(int n){

//Convert a Decimal Number to any binary Number
        return Integer.toString(n,2);

    }

   public static String decimalToBinaryWithoutFuntion(int n){

       int rem=0,s=0,t=0;
       String binaryNumber = "";

       while(n>0)
       {
           rem=n%2;
           n=n/2;
           binaryNumber+=String.valueOf(rem);
       }

      return binaryNumber;
   }
   
    public static void decimalToBinaryUsingRecursion(int n){

        if (n==0){
            return ;
        }else {
            binaryString+=n%2;
            decimalToBinaryUsingRecursion(n/2);
        }
    }
}


