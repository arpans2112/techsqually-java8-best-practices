package com.techsqually.JavaBasicConcepts.inheritance;

public class ClassA extends ClassB{


    public static void main(String[] args) {
//  You can define the object of parent class in reference to Child class. gives compile time error
//    ClassA A = new ClassB();
    }
}


//Circulation extension is not allowed.it gives compile time error
class ClassB {

}
