package com.techsqually.java8Topics.inheritance;

public class Bank {

    public int getInterestRate(){
        return 0;
    }

   /*
      It gives compile time error, Same method name with same parameter having different return type is not allowed
      public float getInterestRate(){
        return 343;
    }*/
}
