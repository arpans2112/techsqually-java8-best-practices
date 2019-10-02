package com.techsqually.java.library.util.random;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random random = new Random();
        /*
         * Returns any random number less than bound value
         * */
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        /*
         * Returns any position/Negative integer within in min and max value
         * */
        int nextInt = random.nextInt();
        System.out.println(nextInt);


    }
}
