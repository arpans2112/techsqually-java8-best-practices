package com.techsqually.java.language.exception;

public class UserDefinedException extends Exception {

    public static int a;
    public static String b;

    UserDefinedException(String errorMessage, String b, int a) {
        super(errorMessage);
        UserDefinedException.a = a;
        UserDefinedException.b = b;

    }


    public static void getMessageWithDetails() {
        System.out.println("We didn't find the file with name " + b + " at index " + a);
    }
}
