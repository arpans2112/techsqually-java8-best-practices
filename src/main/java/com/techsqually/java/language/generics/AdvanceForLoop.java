package com.techsqually.java.language.generics;

import java.util.ArrayList;

public class AdvanceForLoop {


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

    private static void printDouble(ArrayList arrayList) {

        for (Object i : arrayList){
            //When accessing it, You have to explain java which type of Object you are accessing
            //that's why we have defined (Integer)
            System.out.println((Integer)i*2);
        }

    }


}
