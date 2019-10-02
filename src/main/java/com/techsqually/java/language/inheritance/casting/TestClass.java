package com.techsqually.java.language.inheritance.casting;

public class TestClass {

    public static void main(String[] args) {


//        SuperBClass superBClass = new SuperBClass();

//        SubBClass subBClass = new SubBClass();


        /*
         * Down Casting
         * Refereing child object in parent class
         * parent = child;
         * */
        SuperBClass superBClass = new SubBClass();


        /*Child class method access*/
        ((SubBClass) superBClass).nonStaticSub();
        SubBClass.staticSub();
        SubBClass.setSubBid(12);
        SubBClass.getSubBid();
        SubBClass.setSubBName("arpan");


        // Parent class method access
        SuperBClass.setSuperBName("sanjay");
        System.out.println(SuperBClass.getSuperBid());
        SubBClass.staticSub();


        /**
         * NOTE:
         *    i.)  it will throw an run time errror classCast Exception
         *    ii.) upcasting
         *  */
//        SubBClass subBClass1 = (SubBClass) new SuperBClass();

    }
}
