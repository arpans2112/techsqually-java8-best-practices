package com.techsqually.java.library.stream.intstream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CombinedStreams {

    public static void main(String[] args) {


        int[] five = {1,2,4,6,5};
        int[] ten =  {5,8,10,2,4};


      int[] intArray = IntStream.concat(Arrays.stream(five),Arrays.stream(ten))
                          .sorted()
                          .distinct()
                          .toArray();
      System.out.println(Arrays.toString(intArray));








    }


}
