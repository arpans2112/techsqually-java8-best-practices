package com.techsqually.companies.amazon;

import java.util.*;
import java.util.stream.Collectors;

public class SwapingNonSpecialCharacters {


    public static void main(String[] args) {

        String givenString = "babc#de#j@";
        String expectedString = "bjbe#dc#a@";
        newString(givenString,expectedString);

    }



    public static String newString(String givenString, String expectedString){

//        char[] givenArray = givenString.toCharArray();
        ArrayList<Character> givenList = (ArrayList<Character>) givenString.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        int lastIndex = givenList.size() -1;
        for (int i = 0 ; i < givenList.size()/2 ; i++ ){

            if (!Arrays.asList("#","@").contains(Character.toString(givenList.get(i))) &&
                    !Arrays.asList("#","@").contains(Character.toString(givenList.get(lastIndex))) ){
                    Collections.swap(givenList,i,lastIndex);
            }
            lastIndex--;

        }

         //Converting given list into a String
         String newStringTest =  givenList.stream().map(String::valueOf).collect(Collectors.joining());
         return newStringTest;
    }

}
