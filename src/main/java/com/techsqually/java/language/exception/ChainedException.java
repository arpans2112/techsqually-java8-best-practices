package com.techsqually.java.language.exception;

public class ChainedException {

    /*
     * We can use only once .initCause()
     * */

    static void demoChainException() {

        //actual cause of Exception
        NullPointerException nullPointerException = new NullPointerException("Top Exception is Null pointer exception");

        //acually arithmetic excption causing Nullpointer exception
        nullPointerException.initCause(new ArithmeticException("Arithmetic Exception acually causing null pointer exception"));


        throw nullPointerException;

    }

    public static void main(String[] args) {

        try {
            demoChainException();
        } catch (NullPointerException e) {

            System.out.println(e);
            System.out.println(e.getCause());

            System.out.println(e.getCause().getCause());
        }


    }


}
