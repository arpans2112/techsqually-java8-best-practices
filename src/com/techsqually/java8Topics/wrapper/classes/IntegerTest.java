package com.techsqually.java8Topics.wrapper.classes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IntegerTest {

    public static void main(String[] args) {

/*
* Compare Method
* */
        System.out.println(Integer.compare(3,2));
        System.out.println(Integer.compare(2,3));
        System.out.println(Integer.compare(2,2));


        /*
        * digits LIST
        *
        * */

        System.out.println( "Sum Funtion: 2, 3 :" + Integer.sum(2,3));
        System.out.println("Max Funtion 2, 3 : " + Integer.max(2,3));
        System.out.println("Min Funtion : 2,3 : " + Integer.min(2,3));


        System.out.println("Converting Integer to String " + Integer.toString(5));

        System.out.println("Converting String to Integer : " + Integer.valueOf(3+1));

        System.out.println( "Converting stating to Integer "+ Integer.valueOf("1"));


    }




}
