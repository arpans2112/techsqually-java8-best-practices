package com.techsqually.java.library.lang;

public class ObjectClassTest {

    public static void main(String[] args) {

        /**Cloneable is not recommended*/
        CloneObject cloneObject = new CloneObject();
        System.out.println(cloneObject);

    }




}


class CloneObject implements Cloneable{

}