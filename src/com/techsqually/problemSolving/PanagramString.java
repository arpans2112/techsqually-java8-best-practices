package com.techsqually.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;

public class PanagramString {

    public static void main(String[] args) {


        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(s));

    }

    static String pangrams(String s) {

        // String s = "We promptly judged antique ivory buckles for the prize";
       s = s.toLowerCase().replaceAll(" ","");
        ArrayList<Character> ar = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (!ar.contains(s.charAt(i)))
                ar.add(s.charAt(i));
        }

        return ar.size() == 26 ? "pangram" : "not pangram" ;
        //  System.out.println (result);
    }

}
