package com.techsqually.java.language.exception;

public class TryCatchFinallyBlock {


    public static void main(String[] args) throws Exception {

        // tryBlockTest();
        tryCatchBlockTest();
    }

    public static void tryBlockTest() {

        //Only try block will be executed
        try {
            System.out.println("In Try Block");
        } catch (Exception e) {

            System.out.println("In Catch Block");
        } finally {

            System.out.println("In a Finally block");
        }

    }

    public static void tryCatchBlockTest() {

        /*
         * output :
         *   In Try block
         *   In Catch Block
         *   In a finally block
         *   in the End
         *
         * */


        //Execute in try and catch block
        try {

            System.out.println("In Try block");
            //Exception will occur at the below line
            int j = 5 / 0;

            System.out.println("In Try block after the Exception");
        } catch (Exception e) {
            System.out.println("In Catch Block");
        } finally {
            System.out.println("In a finally block");
        }

        System.out.println("in the End");
    }
}
