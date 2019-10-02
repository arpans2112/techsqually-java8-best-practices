package com.techsqually.java.language.exception;

public class ThrowExceptions {

    public static void main(String[] args) throws Throwable {

        throwableException();
        nullPointerException();


    }


    public static void throwableException() throws Throwable {

        System.out.println("before Exception");
        throw new Throwable("we are throwing exception");
    }

    public static void nullPointerException() {

        throw new NullPointerException("null pointer exception");
    }

    public static void runTimeException() {

        throw new RuntimeException("Catching error at run time");
    }
}
