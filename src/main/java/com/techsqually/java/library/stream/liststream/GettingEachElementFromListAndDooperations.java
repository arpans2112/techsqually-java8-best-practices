package com.techsqually.java.library.stream.liststream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GettingEachElementFromListAndDooperations {

    public static int counter = 0;

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("ArpanSaini"));

        stringList.forEach(input -> {
            char[] charArray = input.toCharArray();
            String evenIndexStringUsingStream = IntStream.range(0, charArray.length).filter(i -> i % 2 == 0 || i == 0).mapToObj(i -> charArray[i]).map(String::valueOf).collect(Collectors.joining());
            String oddIndexStringUsingStream = IntStream.range(0, charArray.length).filter(i -> i % 2 == 1).mapToObj(i -> charArray[i]).map(String::valueOf).collect(Collectors.joining());
            counter++;
            if (counter != stringList.size()){
                System.out.println(evenIndexStringUsingStream + "  " + oddIndexStringUsingStream);
            }else {
                System.out.print(evenIndexStringUsingStream + "  " + oddIndexStringUsingStream);
            }

        });

    }
}
