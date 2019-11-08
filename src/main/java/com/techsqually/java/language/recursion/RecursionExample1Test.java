package com.techsqually.java.language.recursion;

public class RecursionExample1Test {

    public int count = 0;

    public static void main(String[] args) {

         RecursionExample1Test recursionExample1Test = new RecursionExample1Test();
        recursionExample1Test.recursion("abc");

    }

    public  void recursion(String givenString){

        if (givenString.length() == 0) return;

        Character c = givenString.charAt(0);
        String rest = givenString.substring(1);

        recursion(rest);

        System.out.println(c);
        System.out.println(rest);

      }

}
