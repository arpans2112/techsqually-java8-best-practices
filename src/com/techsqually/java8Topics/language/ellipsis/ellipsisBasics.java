package com.techsqually.java8Topics.language.ellipsis;

import java.util.Arrays;

public class ellipsisBasics {


    /*
    *   Valid usage of Ellipsis Implementation
    *   public void meth ( int... a) // valid
        public void meth (double a, int... b) // valid
        public void meth ( int... a, int b) // invalid- Ellipsis may be used towards the end only
        public void meth ( int... a, double... b) // invalid - More than one variable length parameter list may not be used
        public void meth ( Student... a) // valid - Reference types are also allowed
        public void meth( int[]... a) // valid - reference types are also allowed
    *
    *
    * */

    public static void main(String[] args) {

        //Calling string elipsis
        /*
        * argument for ellipsis will be the array of the specific Type
        * Return type will be the array of the specific type only
        * */
        System.out.println(Arrays.toString(stringElipsis("Arpan", "Sanjay", "Pranjay", "Anil")));

    }



    public static String[] stringElipsis(String...stringElipsis){
        return stringElipsis;
    }
}
