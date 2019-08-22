package com.techsqually.problemSolving;

import java.math.BigInteger;

public class BigIntegerArray {

    public static BigInteger value ;

    public static long sum ;

    public static void main(String[] args) {

        long[] ar = new long[]{1000000001,1000000002,1000000003,1000000004,1000000003};


        for (long l : ar){

            sum+=l;

        }

        System.out.println(BigInteger.valueOf(sum));
    }
}
