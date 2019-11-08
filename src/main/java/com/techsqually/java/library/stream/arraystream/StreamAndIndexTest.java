package com.techsqually.java.library.stream.arraystream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAndIndexTest {

    public static void main(String[] args) {


        String[] namesArray = {"Sam","Pamela", "Dave", "Pascal", "Erik"};
        List<String> listWithIndex
                =  IntStream.range(0,namesArray.length)
                .mapToObj(i -> namesArray[i]) // Converting each array element into Object
                .map(String::valueOf) // Converting object to String again
                .collect(Collectors.toList()); // getting a Concat String of all values
                 System.out.println(listWithIndex);

    }
}
