package com.techsqually.java.problemSolving.others;

public class delimatedBy {

    public static void main(String[] args) {


        String str = "";
        String delims = "[ _'@.,?!]+";
        String[] tokens = str.trim().split(delims);

        System.out.println("Start test");
        System.out.println(tokens.length);
        for (String s : tokens){

            System.out.println(s);
        }
        System.out.println("End test");

    }

}
