package com.techsqually.java.language.inheritance.casting;

public abstract class SuperBClass {

    public static String superBName = "ChildB";
    public static int superBid = 123;


    public static void setSuperBName(String superBName) {
        SuperBClass.superBName = superBName;
    }

    public static int getSuperBid() {
        return superBid;
    }

    public static void setSuperBid(int superBid) {
        SuperBClass.superBid = superBid;
    }


}
