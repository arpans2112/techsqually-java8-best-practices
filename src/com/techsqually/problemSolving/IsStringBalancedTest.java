package com.techsqually.problemSolving;

import java.util.Stack;

public class IsStringBalancedTest {


    public static void main(String[] args) {

        System.out.println(ValidateString("<<{{>>{}"));;
                int a = 2;


    }

    static boolean ValidateString(String input) {
        /*
         * Write your code here.
         */


        char[] tetst = input.toCharArray();
        Stack<Character> balancedStrings = new Stack<>();

        for(int i=0; i<input.length(); i++){

            if(String.valueOf(input.charAt(i)).equals("<") || String.valueOf(input.charAt(i)).equals("{") ){
                balancedStrings.push(input.charAt(i));
            }else{
                if(!balancedStrings.empty()){
                    if((balancedStrings.lastElement().toString().equals("<") &&   String.valueOf(input.charAt(i)).equals(">")) ||
                            (balancedStrings.lastElement().toString().equals("{")  &&   String.valueOf(input.charAt(i)).equals("}"))){
                        balancedStrings.pop();
                    }
                }
            }
        }

        if(balancedStrings.empty()){
            return true;
        }else{
            return false;
        }


    }

}
