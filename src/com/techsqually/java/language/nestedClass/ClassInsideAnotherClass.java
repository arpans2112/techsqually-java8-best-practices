package com.techsqually.java.language.nestedClass;

public class ClassInsideAnotherClass {

    public static int classInsideAnotherClassVar = 2;


    /*
     * 1. Inside  class can't have static members
     * 2. you can even access all members including private by creating object of Inner Class
     * 3. you can't access the inside class private members from the class but public member can be accessed
     * 4. Best practices says inner class must be a non-static so that can't be accessed from another class
     * 5. Inner Class can be created in any block even with in the method or within the for loop
     * 6. Inner class are practically used in case of Event handeler to simplify some situations
     *
     * */

    public static void main(String[] args) {


    }

    public static void staticMethod() {


    }

    public void nonStaticMethod() {

        InsideClass insideClass = new InsideClass();
        System.out.println(insideClass.insideClassPrivateVar);
        System.out.println(insideClass.insideClassPublicVar);
        insideClass.nonstaticMethodOfInsideClass();


    }

    class InsideClass {

        public int insideClassPublicVar = 1;
        private int insideClassPrivateVar = 2;

        public void staticMethodOfInsideClass() {
            System.out.println("staticMethodOfInsideClass");
            staticMethod();
            System.out.println(classInsideAnotherClassVar);

        }

        public void nonstaticMethodOfInsideClass() {
            System.out.println("nonstaticMethodOfInsideClass");
            /*
             * For non static members access you must create object of outer class
             * */
            ClassInsideAnotherClass classInsideAnotherClass = new ClassInsideAnotherClass();
            classInsideAnotherClass.nonStaticMethod();

            /*
             * Static method can be access directly as Inner class is in a scope of OuterClass
             * */
            staticMethod();
            System.out.println(classInsideAnotherClassVar);

        }


    }
}
