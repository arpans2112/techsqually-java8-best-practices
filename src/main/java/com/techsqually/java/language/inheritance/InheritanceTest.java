package com.techsqually.java.language.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {


        //At run time it's going to be decided the the reference of parent class is having the object
        // of what class, and based on that it's going to return the value. It's called run time polymorphism

        Bank b = new AxisBank();
             b = new ICICIBank();
        System.out.println(b.getInterestRate());


    }


}
