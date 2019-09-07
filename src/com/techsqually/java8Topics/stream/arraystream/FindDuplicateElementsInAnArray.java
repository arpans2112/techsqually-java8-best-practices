package com.techsqually.java8Topics.stream.arraystream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDuplicateElementsInAnArray {


    public static void main(String[] args) {

        int[] a = {2, 2, 3, 3, 4, 5};
        findDuplicateElementsSetInAGivenArray(a);

    }

    public static HashSet findDuplicateElementsSetInAGivenArray(int[] givenArray) {

        HashSet<Integer> abc = (HashSet<Integer>) Arrays.stream(givenArray).distinct()
                .filter(i -> Collections.frequency(Arrays.stream(givenArray)
                        .boxed()
                        .collect(Collectors.toList()), i) > 1)
                .mapToObj(Integer::new)
                .collect(Collectors.toSet());

        System.out.println(abc);

        return abc;

    }
}
