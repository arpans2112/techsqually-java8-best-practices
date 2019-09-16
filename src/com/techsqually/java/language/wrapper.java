package com.techsqually.java.language;

public class wrapper {


    public static void main(String[] args) {

        Integer a = 10 * 10 * 10;
        Integer b = 100 * 10;

        System.out.println(a.equals(b));
        System.out.println(a == b);

        /* value store in Interger var reference is within the range of -128 to 127
         *  both variables points to single mememory reference
         *
         *  if -128 < i < 127
         *     i8a == i8b -> true refers to same memory
         *     if out of range
         *      returns false -> creates two different memory so returns false
         *
         *  */

        Integer i8a = 128;
        Integer i8b = 128;

        /* if */
        int i9a = 127;
        int i9b = 127;

        System.out.println(i8a.equals(i8b));
        System.out.println(i8a == i8b);
        System.out.println(i9a == i9b);


    }
}
