package com.techsqually.java.library.stream.intstream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class getEvenOddArrayIndexElement {

    public static String evenString = "";
    public static String oddString = "";

    public static void main(String[] args) {

        String name = "ArpanSaini";
        char[] charArray = name.toCharArray();





        //Getting the even/Odd index array characters in the Object array
       Object[] evenStringArray = IntStream.range(0,charArray.length).filter(i -> i % 2 == 0 || i ==0).mapToObj(i -> charArray[i]).toArray();
       Object[] oddStringArray = IntStream.range(0,charArray.length).filter(i -> i % 2 == 1).mapToObj(i -> charArray[i]).toArray();


        //To  print the Object array
        System.out.println(Arrays.toString(evenStringArray));
        System.out.println(Arrays.toString(oddStringArray));

        IntStream.range(0,charArray.length).filter(i -> i % 2 == 0 || i ==0).mapToObj(i -> charArray[i]).forEach(c -> evenString+=c);
        IntStream.range(0,charArray.length).filter(i -> i % 2 == 1).mapToObj(i -> charArray[i]).forEach(c -> oddString+=c);


       String evenIndexStringUsingStream = IntStream.range(0,charArray.length).filter(i -> i % 2 == 0 || i ==0).mapToObj(i -> charArray[i]).map(String::valueOf).collect(Collectors.joining());
       String oddIndexStringUsingStream = IntStream.range(0,charArray.length).filter(i -> i % 2 == 1).mapToObj(i -> charArray[i]).map(String::valueOf).collect(Collectors.joining());

       System.out.println(evenIndexStringUsingStream + "  " + oddIndexStringUsingStream);

        System.out.println(evenString + "  "+ oddString);


        char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        //Converting Character Array to String
        System.out.println(String.valueOf(a));

        //Converting Character array to String
       String stringValue = Arrays.stream(new char[][]{a}).map(String::valueOf).collect(Collectors.joining());

       System.out.println(stringValue);


       String[] namesArray = {"Sam","Pamela", "Dave", "Pascal", "Erik"};
       String completeString
               = IntStream.range(0,namesArray.length).mapToObj(i -> namesArray[i]).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(completeString);

    }




}
