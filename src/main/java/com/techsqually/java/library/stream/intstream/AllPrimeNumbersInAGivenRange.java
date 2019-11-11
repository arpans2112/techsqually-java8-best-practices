package com.techsqually.java.library.stream.intstream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.IntStream;
import static java.lang.System.in;

public class AllPrimeNumbersInAGivenRange {

    public static void main(String[] args) {


        System.out.println(allPrimeNumberInAGiveRange(100));

        BufferedReader br=new BufferedReader(new InputStreamReader(in));
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
