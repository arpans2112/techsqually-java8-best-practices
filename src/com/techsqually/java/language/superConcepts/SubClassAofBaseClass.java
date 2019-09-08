package com.techsqually.java.language.superConcepts;

public class SubClassAofBaseClass extends BaseClass {
    public int l = 0;
    private int k = 0;

    SubClassAofBaseClass(int i, int j, int k, int l) {
        super(i, j);
        System.out.println("We are in SubClassAofBaseClass Constructor");
        this.k = k;
        this.l = l;
    }
}
