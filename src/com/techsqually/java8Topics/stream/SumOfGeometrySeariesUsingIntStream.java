package com.techsqually.java8Topics.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfGeometrySeariesUsingIntStream {


    public static void main(String[] args) {


        System.out.println(getGeometorySeariesSum(10,0,2));


    }

    public static String getGeometorySeariesSum(int n, int a, int b){

        String geometorySearies  = IntStream.range(1,n+1)
                                      .map(i -> a + b *((int)Math.pow(2,i)-1))
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining(" "));

        return geometorySearies;
    }
    
}
