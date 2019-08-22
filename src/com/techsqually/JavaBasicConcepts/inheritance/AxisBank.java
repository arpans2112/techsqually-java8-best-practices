package com.techsqually.JavaBasicConcepts.inheritance;


public class AxisBank extends Bank {

    @Override
    public int getInterestRate() {
        return 5;
    }

    /*
    * same method name with different Number of parameters are allowed is called Overloading
    * */
    public int getInterestRate(int i){
        return i;
    }

    /*
     * same method name with different type of parameter are allowed is called OverLoading
     * */
    public int getInterestRate(String i){
        return Integer.parseInt(i);
    }

   /*
            Method with same name and same parameters are not allowed even though they they have different
            return type.
   public float getInterestRate(String i){
        return 23.23;
    }
    */
}
