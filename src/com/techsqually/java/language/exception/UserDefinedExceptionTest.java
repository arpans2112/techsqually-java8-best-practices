package com.techsqually.java.language.exception;

public class UserDefinedExceptionTest {


    /*
     * All different type fo execptions must be declared as comma separated with method signature
     * */
    public static void main(String[] args) throws NullPointerException {

        try {
            if (true)
                throw new UserDefinedException("We have created this exception", "dataFile", 0);
            else
                throw new NullPointerException("method can send Multiple Exception test");

        } catch (UserDefinedException e) {

            System.out.println(e.getCause());
            e.printStackTrace();
            e.getLocalizedMessage();
            e.getMessage();
            UserDefinedException.getMessageWithDetails();
        }
    }
}
