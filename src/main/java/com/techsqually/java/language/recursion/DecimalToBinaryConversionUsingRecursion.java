package com.techsqually.java.language.recursion;

public class DecimalToBinaryConversionUsingRecursion {

    private static String binaryString ="";

    public static void main(String[] args) {

        decimalToBinary(5);
        System.out.println(binaryString);
    }


    public static void decimalToBinary(int n){

        if (n==0){
            return ;
        }else {
            binaryString+=n%2;
            decimalToBinary(n/2);
        }
    }
}
