package com.techsqually.java8Topics.generics.basics.example2multipletypeparameters;

import com.techsqually.java8Topics.generics.basics.example1typeclassinvocation.Box;

public class OrderdPairTest {


    public static void main(String[] args) {

        //Same data type
        OrderedPair<String,String> orderedPairStrings = new OrderedPair<>("Arpan","Saini");
        System.out.println(orderedPairStrings.getKey());;
        System.out.println(orderedPairStrings.getValue());;

        //Different Data Type parameters String , Integer
        OrderedPair<String,Integer> orderedPairMixedDataType = new OrderedPair<>("Arpan",8018678);
        System.out.println(orderedPairMixedDataType.getKey());
        System.out.println(orderedPairMixedDataType.getValue());

        //String and Object type parameters
        OrderedPair<String, Box<Integer>> typeParameterClass = new OrderedPair<>("Arpan",new Box<>());
        System.out.println(typeParameterClass.getKey());
        typeParameterClass.getValue().set(7);
        System.out.println(typeParameterClass.getValue().get());


    }

}
