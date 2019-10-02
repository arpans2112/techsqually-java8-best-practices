package com.techsqually.java.library.stream.intstream;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class AllPrimeNumbersInAGivenRange {

    public static void main(String[] args) {


        System.out.println(allPrimeNumberInAGiveRange(100));
    }

    public static ArrayList allPrimeNumberInAGiveRange(int givenRange){
        ArrayList<Integer> listOfPrimeNumber = new ArrayList<>();

        IntStream.range(2,givenRange).forEach(i -> {
            boolean isPrime = true;
            for (int j = 2 ; j < i; j++){

                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                listOfPrimeNumber.add(i);
            }
        });

        return listOfPrimeNumber;
    }
}
