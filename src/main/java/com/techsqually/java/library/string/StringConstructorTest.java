package com.techsqually.java.library.string;



public class StringConstructorTest {


    public static void main(String[] args) {


        /**Different Type of Constructor of String class object*/

        String abc = new String();
        System.out.println(abc);

        String givenString = new String("arpan");
        System.out.println(givenString);

        char[] givenChar = {'a','r','p','a','n'};
        System.out.println(new String(givenChar));

        //Start Index , length of the characters
        System.out.println(new String(givenChar,2,2)); // results pa


        byte[] givenByteArray = {65,66,67,68,69,70};
        System.out.println(new String(givenByteArray).toLowerCase());


        byte[] givenByteArrayWithIndex = {65,66,67,68,69,70};
        System.out.println(new String(givenByteArray,2,3).toLowerCase());


        StringBuffer sbuffer = new StringBuffer("stringBuffer");
        System.out.println(new String(sbuffer));

        StringBuilder sbuilder = new StringBuilder("stringBuilder");
        System.out.println(new String(sbuilder));

    }

}
