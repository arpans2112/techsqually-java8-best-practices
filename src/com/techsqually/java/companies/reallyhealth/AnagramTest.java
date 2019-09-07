package com.techsqually.java.companies.reallyhealth;

import java.util.Arrays;

public class AnagramTest {


    public static void main(String[] args) {
        System.out.println(isAnnagram("arpan","aparn") ? "Is Annagram": "Not an Annagram");
    }


    public static boolean isAnnagram(String a , String b){

        char[] acharArray = a.toCharArray();
        char[] bcharArray = b.toCharArray();

        if (a.length() !=  b.length())
            return false;
        else{
            Arrays.sort(acharArray);
            Arrays.sort(bcharArray);
            return Arrays.equals(acharArray,bcharArray);
        }
    }




}
