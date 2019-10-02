package com.techsqually.java.language.unicodecharacters;

import javax.xml.bind.SchemaOutputResolver;

public class EnglishCharacters {


    /**
     *  Unicode Range
     *  A-Z : 65-90
     *  a-z : 97-122
     * */

    public static char c;

    public static void main(String[] args) {

        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');

        System.out.println(c ='a'+2);
        System.out.println(c  ='z'-6);


    }
}
