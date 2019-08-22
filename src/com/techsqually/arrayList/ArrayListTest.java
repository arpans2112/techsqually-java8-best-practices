package com.techsqually.arrayList;

import com.techsqually.array.IntegerArrayUtility;

import java.util.ArrayList;

public class ArrayListTest {


    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        int sizeofArrayList = strings.size();
        //Default Size of An array is Zero
        System.out.println("sizeofArrayList = " + sizeofArrayList);

        ArrayListUtilities arrayListUtilities = new ArrayListUtilities();
        arrayListUtilities.addItem("arpan");
        arrayListUtilities.addItem("Sanjay");
        arrayListUtilities.addItem("Kiran");
        arrayListUtilities.addItem("Anil");
        arrayListUtilities.printArrayList(arrayListUtilities.getInstanceOfArrayListUtilities());

       /* System.out.println(arrayListUtilities.findItem("Maya"));

        System.out.println(arrayListUtilities.indexOfAnItem("Kiran"));
        System.out.println(arrayListUtilities.indexOfAnItem("Maya"));*/

        System.out.println("Printing New Array");
       ArrayList<String> newArray = arrayListUtilities.copyArray();
       newArray.add(1, "Maya");
       arrayListUtilities.printArrayList(newArray);

       String[] convertedArray = arrayListUtilities.ConvertArrayListToArray(newArray);
       IntegerArrayUtility intergerArrayUtilities = new IntegerArrayUtility();
       for (int i=0 ; i < convertedArray.length ; i ++){

           System.out.println(convertedArray[i]);
       }




    }
}
