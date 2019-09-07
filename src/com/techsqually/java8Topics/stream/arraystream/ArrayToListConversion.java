package com.techsqually.java8Topics.stream.arraystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToListConversion {


    public static void main(String[] args) {

        int[] givenArray = {2, 2, 3, 3, 4, 5};
        String[] stringArray = {"Arpan", "Sanjay", "Anil"};

        /*
         * Converting integer array to Integer List
         * */

        // One way:   boxed() -> returns the IntStream
        List<Integer> givenIntArray1 = Arrays.stream(givenArray).boxed().collect(Collectors.toList());
        System.out.println(givenIntArray1);

        // Second Way:  map each element of the stream to Integer and then collect
        //Using mapToObj you can covert each int element into string stream, char stream etc by casing i to (char)i
        List<Integer> givenIntArray2 = Arrays.stream(givenArray).mapToObj(i -> i).collect(Collectors.toList());
        System.out.println(givenIntArray2);

        ArrayList<Integer> abc = new ArrayList(Arrays.asList(givenArray));
        System.out.println(abc);



        /*
         * Converting integer array to Integer Set
         * */

        Set<Integer> givenIntSet = Arrays.stream(givenArray).boxed().collect(Collectors.toSet());
        System.out.println(givenIntSet);

        /*
         * Converting String array to String List
         * */
        List<String> givenStringList = Arrays.stream(stringArray).collect(Collectors.toList());
        System.out.println(givenStringList);
    }
}
