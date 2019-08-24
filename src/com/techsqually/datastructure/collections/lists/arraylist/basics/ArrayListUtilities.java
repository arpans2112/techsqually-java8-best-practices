package com.techsqually.datastructure.collections.lists.arraylist.basics;

import java.util.ArrayList;

public class ArrayListUtilities {


    ArrayList<String> arrayList = new ArrayList<String>();

    //add item to array List
    public void addItem(String item) {
        arrayList.add(item);
    }

    //Add item to a specific Location
    public void addItem(int index, String item) {

        arrayList.add(index, item);
    }

    //Print array List

    public void printArrayList(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(i + 1 + " : " + arrayList.get(i));
        }
    }


    public void removeItem(int index) {
        arrayList.remove(index);
    }


    //Return : True if element found
    //Return : False if element not found
    public boolean isItemPresent(String item) {
        return arrayList.contains(item);
    }

    //Return index no if item found , Else Return -1
    public int indexOfAnItem(String item) {
        return arrayList.indexOf(item);
    }

    public void modifyItem(String oldItem, String newItem) {

        if (arrayList.contains(oldItem)) {

            int indexPostion = arrayList.indexOf(oldItem);
            arrayList.add(indexPostion, newItem);
        } else {
            System.out.println("Old Item is Not Present in the Array List");
        }
    }

    public ArrayList<String> getInstanceOfArrayListUtilities() {
        return arrayList;
    }


    //Copy ONe array into another Array
    public ArrayList<String> copyArray(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(arrayList);
    /*
    * Or we can copy below way
    *  ArrayList<String> newArrayList = new ArrayList<String>(arrayList);
    * */
        return newArrayList;
    }

    //Converting array list into an array
    public String[] ConvertArrayListToArray(ArrayList<String> arrayList){

        //Creating an array of size equal to array List
        String[] convertedArray = new String[arrayList.size()];

        //Converting array list into array
        return arrayList.toArray(convertedArray);

    }

}




