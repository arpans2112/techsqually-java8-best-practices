package com.techsqually.java8Topics.overloading;

public class MethodOverLoading {

    /*
    * 1.   Mathod overloading has nothing to do with return type, it will give you compile time error
    * 2.   Method with same number of Parameters - must be different in parameter types
    * 3.   Method with different number of parameters, one with one parameter, another with 2 parameters
    * 4.   One override method can be called from another print
    * 5.   with extra parameter we can have two different implementation - used only if they are closely related to each other
    *      e.g printTest with string parameters example
    * */

    public static void main(String[] args) {

        /*
        * Note: if we are  note having printTest(int i) method and we pass the int argument
        * then it will look for a method with printTest(int i), that will be executed, if it
        * didn't find any method with that type, it will make auto conversion of variable type and will
        * lookfor the related method, in our case it wil go for the printTest(double d) as int i can be
         * automatic converted to double value. and will call that method.
        * */

        printTest();
        printTest(5);
        printTest(3.4);
        printTest(5,3.4);
        printTest("Arpan");
        printTest("Arpan","Lower");
        printTest("Arpan", "");

    }


    public static void printTest(){

        System.out.println("Just Printing");

    }

    public static void printTest(int i){

        System.out.println("Printing int : " +  i);
    }

    public static void printTest(Double d){

        System.out.println("Printing Double : " + d);
    }

    public static void printTest(int i , double d){

        System.out.println("Printing int and double : " + i + " : " + d);
    }

    public static void printTest(String givenString){

        System.out.println("Printing String : " + givenString);
    }

    public static void printTest(String givenString, String caseType){
        switch (caseType){
            case "Lower":
                System.out.println(givenString.toLowerCase());
                break;
            case "Upper":
                System.out.println(givenString.toUpperCase());
                break;
             default:
                 printTest(givenString);
        }
    }
}
