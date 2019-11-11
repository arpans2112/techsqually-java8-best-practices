package com.techsqually.java.problemSolving.HackerRank;

public class Solution{

    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.checkPrime(2);
        prime.checkPrime(2,1);
        prime.checkPrime(2,1,3);
        prime.checkPrime(2,1,3,4,5);

    }


}

class Prime {


    public static void checkPrime(int... numbers) {


        StringBuilder sb = new StringBuilder();

        for (Integer i : numbers) {

            boolean isPrime = true;

            if (i != 1) {

                for (int j = 2; j <= Math.sqrt(i); j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }

                }

            } else {
                isPrime = false;
            }


            if (isPrime) {
                sb.append(i).append(" ");
            }


        }
        System.out.println(sb.toString().trim());
    }

}




