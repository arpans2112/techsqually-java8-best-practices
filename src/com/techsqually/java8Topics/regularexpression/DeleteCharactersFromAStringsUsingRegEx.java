package com.techsqually.java8Topics.regularexpression;

import java.util.Arrays;

public class DeleteCharactersFromAStringsUsingRegEx {

    public static void main(String[] args) {

        String input = "He is a very very good boy, isn't he?";
        String delims = "[ _'@.,?!]+";
        String[] splitedArray = input.split(delims);
        String afterDelims = Arrays.toString(splitedArray);
        afterDelims=  afterDelims.replaceAll("[,]","").replace("[","").replace("]","");
        System.out.println(afterDelims);


    }



}
