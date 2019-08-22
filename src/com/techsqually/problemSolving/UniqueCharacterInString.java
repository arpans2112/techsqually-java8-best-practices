package com.techsqually.problemSolving;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacterInString {


    public static void main(String[] args) {

        String given = "asdcbsdcagfsdbgdfanfghbsfdab";
        char[] characterArray = given.toCharArray();


        Arrays.parallelSort(characterArray);

        ArrayList<Character> abc = new ArrayList<>();

        for (Character a: characterArray){
            abc.add(a);
        }

        for (int i = 0; i < abc.size()-1; i++){
            if(abc.get(i).compareTo(abc.get(i+1)) != -1){
                abc.remove(i+1);
                i =0;
            }
        }

        System.out.println(abc);
//
//        for(int i =0 ; i < characterArray.length-1;  i++){
//            if (Character.toString(characterArray[i]).compareTo(Character.toString(characterArray[i+1])) != -1){
//
//                i =0 ;
//            }
//        }
//
//
////        System.out.println(Arrays.toString(characterArray));
////        System.out.println(Arrays.toString(characterArray).replace(",","").replace("[","").replace("]","").replace(" ",""));
////        System.out.println( Arrays.toString(characterArray).replaceAll("[, ]","").substring(1,Arrays.toString(characterArray).replaceAll("[, ]","").length()-1));
//
//        ArrayList<Character> ar = new ArrayList<>();
//
//        for (int i= 0; i < given.length(); i++){
//            if(!ar.contains(given.charAt(i)))
//                ar.add(given.charAt(i));
//        }
//
//        //To Get the Consecutive Characters in an Array
//        Collections.sort(ar);
//        for(int i =0 ; i < ar.size()-1;  i++){
//            if (ar.get(i).compareTo(ar.get(i+1)) != -1){
//                ar.remove(i+1);
//                i =0 ;
//            }
//        }
//
//        for (int i =0 ; i < given.length(); i++){
//
//           int numericValueOfA = Character.getNumericValue(given.charAt(i));
//           int numericValueOfB = Character.getNumericValue(given.charAt(i+1);
//
//            if (numericValueOfA != numericValueOfB+1){
//              given = given.replaceAll(Character.toString(given.charAt(i)),"");
//              i-=1;
//            }
//        }

        System.out.println(given.length());

    }


}
