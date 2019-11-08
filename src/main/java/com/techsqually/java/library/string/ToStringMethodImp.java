package com.techsqually.java.library.string;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

public class ToStringMethodImp {


    public static void main(String[] args) {

        /**
         * Note when the object is defined in the print or println then b.toString() method will be called
         * automatically
         *
         * or when we use concat funtion with another string, it will automatically call toString() Method
         * if To String Method is not OVerrided then below output will be printed
         *         com.techsqually.java.library.string.Box@1540e19d
         * Box b : com.techsqually.java.library.string.Box@1540e19d
         *
         *
         * */
        Box b = new Box(10,11,12);
        System.out.println(b);

        String btest = "Box b : " + b;
        System.out.println(btest);

        /**Note: Projected and deault can be access from the sub class but the private can't be*/
        System.out.println(Box.depth);
        System.out.println(Box.height);


    }
}

class Box {

    /**
     * Box class implements the toString Method
     */

 private static int width;
 protected static int height;
    static int depth;

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}