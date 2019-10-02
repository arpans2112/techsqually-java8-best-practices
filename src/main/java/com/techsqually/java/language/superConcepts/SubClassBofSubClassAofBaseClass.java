package com.techsqually.java.language.superConcepts;

public class SubClassBofSubClassAofBaseClass extends SubClassAofBaseClass {

    public int l;

    SubClassBofSubClassAofBaseClass(int i, int j, int k, int l, int m) {
        super(i, j, k, l);
        System.out.println("We are in SubClassAofBaseClass Constructor");
        this.l = m;
    }

    public void getMethod() {

        //Super word is used to get memeber of superclass if the same variable name is used in sub class
        //this is l of SuperClass
        System.out.println(super.l);
        //this is l of sub class
        System.out.println(l);
        //this is from baseClass
        System.out.println(j);
    }
}
