package com.techsqually.java.language.generics.basics;

public class ArrayPrint {

    public static void main(String[] args) {

/**
 * Note that it support only Object array not the permitive array, permitive array has to behandel
 * as given below
 * */
        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"Arpan", "Sanjay", "Pranjay"};

        printArray(intArray);
        printArray(charArray);
        printArray(stringArray);

    }


    public static <E> E printArray(E[] givenArray) {

        System.out.print("[ ");
        for (E element : givenArray) {

            System.out.print(element + ", ");
        }
        System.out.println("]");
        return (E) givenArray;
    }

}


