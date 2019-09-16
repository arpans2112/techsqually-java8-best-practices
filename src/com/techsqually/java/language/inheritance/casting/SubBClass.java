package com.techsqually.java.language.inheritance.casting;

public class SubBClass extends SuperBClass {

    public static String SubBName = "ChildB";
    public static int SubBid = 123;


    public static String getSuperBName() {
        System.out.println("Overriding getsuperBName");
        return superBName;
    }


    public static void setSuperBName(String superBName) {
        System.out.println("Overriding setSuperBName");
        SuperBClass.superBName = superBName;
    }


    public static String getSubBName() {
        return SubBName;
    }

    public static void setSubBName(String subBName) {
        SubBName = subBName;
    }

    public static int getSubBid() {
        return SubBid;
    }

    public static void setSubBid(int subBid) {
        SubBid = subBid;
    }

    public static void staticSub() {
        System.out.println(SubBClass.class.getName());
    }

    public void nonStaticSub() {
        System.out.println(SubBClass.class.getName());
    }


}
