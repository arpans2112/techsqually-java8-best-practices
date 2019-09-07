package com.techsqually.java8Topics.overloading;

public class ConstructorOverLoading {

    int a, b, c;

    ConstructorOverLoading() {
        System.out.println("No Parameter");
    }

    ConstructorOverLoading(ConstructorOverLoading constructorOverLoading) {

        /*
         * object Cloning
         * */
        a = constructorOverLoading.a;
        b = constructorOverLoading.b;
        c = constructorOverLoading.c;
    }

    ConstructorOverLoading(int a) {
        this.a = b = c = a;
        System.out.println(this.a + " : " + this.b + " : " + this.c);
    }

    ConstructorOverLoading(int a, int b) {

        this.a = a;
        this.b = c = b;
        System.out.println(this.a + " : " + this.b + " : " + this.c);
    }

    ConstructorOverLoading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println(this.a + " : " + this.b + " : " + this.c);
    }

    ConstructorOverLoading(String c) {
        System.out.println("Having Constructor parameter of Different Data Type : " + c);
    }

    public static void main(String[] args) {


        /*
         * Constructor OverLoading Can be used either of the give below ways, Where we
         * can use different ways of initialize the variables
         * */
        ConstructorOverLoading noParameter = new ConstructorOverLoading();
        ConstructorOverLoading withObjectParameter = new ConstructorOverLoading(new ConstructorOverLoading(10));
        System.out.println(withObjectParameter.a + " : " + withObjectParameter.b + " : " + withObjectParameter.c);
        ConstructorOverLoading intOneParameter = new ConstructorOverLoading(1);
        ConstructorOverLoading intTwoParameter = new ConstructorOverLoading(1, 2);
        ConstructorOverLoading intThreeParameter = new ConstructorOverLoading(1, 2, 3);
        ConstructorOverLoading abc = new ConstructorOverLoading("Arpan");

    }
}
