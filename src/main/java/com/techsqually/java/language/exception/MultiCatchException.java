package com.techsqually.java.language.exception;

public class MultiCatchException {


    public static void main(String[] args) {

        /*
         * Added after JDK : 7
         * Both type of exception can be handel by single catch block, can be added multipli
         * excepting using or operator | ,
         * created to method to test two different scenarios to test different exceptions
         *
         * */


        //        arithmeticExceptionCaught();

        indexOutOfBoundsExceptionCaught();

    }

    public static void arithmeticExceptionCaught() {

        try {
            int a = 10 / 0;
            int[] test = new int[10];
            test[5] = 12;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception Caught : " + e);
        }

    }

    public static void indexOutOfBoundsExceptionCaught() {

        try {
            int a = 10 / 4;
            int[] test = new int[10];
            test[12] = 12;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception Caught : " + e);
        }

    }
}
