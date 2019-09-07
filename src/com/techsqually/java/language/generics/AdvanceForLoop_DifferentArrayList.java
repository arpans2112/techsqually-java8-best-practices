package com.techsqually.java.language.generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdvanceForLoop_DifferentArrayList {


    public static void main(String[] args) {

//This array list store objects of class, here we are storing integer objects in the array List
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);


        printDouble(arrayList);
    }

    //By giving the annotaction, You can pass the null array list as a parameter in the below method, it will throw
    //an exeception of Illegal argument passed in printDouble method

    private static void printDouble(@NotNull ArrayList<Integer> arrayList) {

        for (int i : arrayList){
            //When accessing it, You have to explain java which type of Object you are accessing
            //that's why we have defined (Integer)
            System.out.println(i*2);
        }

    }


}
