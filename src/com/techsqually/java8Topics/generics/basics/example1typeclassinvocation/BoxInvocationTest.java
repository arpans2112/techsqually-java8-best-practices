package com.techsqually.java8Topics.generics.basics.example1typeclassinvocation;

public class BoxInvocationTest {


    public static void main(String[] args) {


        /*
        * You can make a Box type class as dyanamic based on the type argument you passed
        *
        * */
        Box<Integer> integerBox = new Box<>();
        integerBox.set(2);
        System.out.println(integerBox.get());;

        Box<String> stringBox = new Box<>();
        stringBox.set("Arpan");
        System.out.println(stringBox.get());

    }
}
