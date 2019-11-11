package com.techsqually.java.library.cldrdata;

import sun.text.resources.cldr.hi.FormatData_hi;

import java.util.Arrays;
import java.util.Enumeration;

public class FormatDataHi {

    public static void main(String[] args) {

        FormatData_hi formatData_hi =    new FormatData_hi();
        Enumeration<String> formatkeys = formatData_hi.getKeys();
        while(formatkeys.hasMoreElements()){

            String key = formatkeys.nextElement();
            Object value = formatData_hi.getObject(key);

            try {
                if (value.getClass().getComponentType().equals(String.class)){
                    String[] array = (String[]) value;
                    System.out.println(key + " : " +Arrays.toString(array));
                }
            } catch (NullPointerException e) {
                System.out.println(key + " : " + value);
            }

        }


    }
}
