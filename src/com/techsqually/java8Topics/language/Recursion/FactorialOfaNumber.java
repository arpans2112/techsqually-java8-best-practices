package com.techsqually.java8Topics.language.Recursion;

public class FactorialOfaNumber {

    public static void main(String[] args) {


        System.out.println(factorial(12));

        System.out.println(factorialTernaryOperator(12));
    }


    public static int factorial(int n){

        if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static int factorialTernaryOperator(int n){
        return (n == 1 || n == 0) ? 1 : (n * factorial(n-1));
    }
}
