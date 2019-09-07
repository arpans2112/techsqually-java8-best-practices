package com.techsqually.java8Topics.language.TernaryOperator;

public class NestedTernaryOperatorTest {

    public static void main(String[] args) {

        System.out.println(compare(2,3));
        System.out.println(compare(3,2));
        System.out.println(compare(3,3));
    }


     public static int compare(int x, int y) {

        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}
