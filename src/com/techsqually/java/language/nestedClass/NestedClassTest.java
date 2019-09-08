package com.techsqually.java.language.nestedClass;

public class NestedClassTest {

    public static int a;
    public int b;


    /*
     * NOTE:
     *  1. Inner class can be access from other class like AccessInnerClassOfNestedClassTest is accessing InnerClass of this class
     *  2. you can have two main methods in both the class and can run them separately  and test
     *  3. Non static members can be access by object reference
     *  4. static members can be access by className.memberName
     *  4. static variable can be access in a non static and static methods of a class
     *  5. Non static variables can't be access in static method
     * */

    public static void main(String[] args) {

        System.out.println(InnerClass.innerMemberPubic);

        /*
         * Non static member access by object creation
         * */
        InnerClass innerClass = new InnerClass();
        innerClass.nonStaticMethod();

        /*
         * static member access by className.memberName
         * */
        System.out.println(InnerClass.innerMemberPubic);
        InnerClass.staticMethod();


//        System.out.println(b);


    }

    public static void staticMethodOfNestedClass() {

        System.out.println("In in staticMethodOfNestedClass");
    }

    public void nonStaticMethodOfNestedClass() {
        System.out.println("In in nonStaticMethodOfNestedClass");

        InnerClass innerClass = new InnerClass();
        innerClass.nonStaticMethod();

        innerClass.nonStaticMethod();
        InnerClass.staticMethod();

        System.out.println(b);
        System.out.println(a);


    }

}

class InnerClass {

    public static int innerMemberPubic = 3;
    private static int innerMemberPrivate = 2;

    public static void main(String[] args) {

        System.out.println(innerMemberPrivate);
        System.out.println(innerMemberPubic);

    }

    public static void staticMethod() {
        System.out.println("I'm in static method");
    }

    public void nonStaticMethod() {

        System.out.println("I'm in nonStaticMethod");
    }

}
