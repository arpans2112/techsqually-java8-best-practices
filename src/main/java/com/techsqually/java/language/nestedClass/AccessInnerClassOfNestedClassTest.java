package com.techsqually.java.language.nestedClass;

public class AccessInnerClassOfNestedClassTest {


    public static void main(String[] args) {

        /*
         * Non static members can be access using object/Instance Creation
         * */
        InnerClass innerClass = new InnerClass();
        innerClass.nonStaticMethod();

        /*
         * Static members can be access by className.memberName
         * */
        InnerClass.staticMethod();
        System.out.println(InnerClass.innerMemberPubic);


    }

    public void nonStaticMethodAccessingInnerClass() {

        /*
         * you can't access the inside class private members from the class
         * */
//        ClassInsideAnotherClass.InsideClass abc = new ClassInsideAnotherClass.InsideClass();
//        System.out.println(abc.insideClassPublicVar);


    }
}
