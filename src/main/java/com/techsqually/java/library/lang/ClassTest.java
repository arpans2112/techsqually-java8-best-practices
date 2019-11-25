package com.techsqually.java.library.lang;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println(ClassTest.class.getClass());;
//        System.out.println(ClassTest.class.forName("RunTimeTest.java"));
        System.out.println(ClassTest.class.getName());
        System.out.println(ClassTest.class.getPackage());
        System.out.println(ClassTest.class.getSimpleName());

        /**To get the object of a class*/
        ClassTest classTest = new ClassTest();
        Class<?> clazz = classTest.getClass();
        System.out.println(clazz.getName());

    }
}
