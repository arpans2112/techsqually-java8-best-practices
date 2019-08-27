package com.techsqually.problemSolving.strings;



import java.util.Stack;

public class BalancedStringUsingRegularExpression {


    public static void main(String[] args) {

        System.out.println(is_balanced("()()()()"));
        System.out.println(is_balanced(")()()()("));
        System.out.println(is_balanced("((())())"));
        System.out.println(is_balanced("(((((())"));

    }


    public static boolean is_balanced(String inputString) {

        boolean isBlanced = false;
        Stack openBrancesStake = new Stack();
        int index = 0;
        while (index < inputString.length()) {

            if (Character.toString(inputString.charAt(index)).equals("(")) openBrancesStake.push("(");
            else if (Character.toString(inputString.charAt(index)).equals(")")){
                if (!openBrancesStake.empty()){
                    openBrancesStake.pop();
                }else
                    return isBlanced;
            }
        }

        if (openBrancesStake.empty())
            return true;
        else return false;

    }
}