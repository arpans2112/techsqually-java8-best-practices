package com.techsqually.java.companies.overstock;



import java.util.Stack;

public class BalancedStringUsingRegularExpression {


    public static void main(String[] args) {

        System.out.println(isBalanced("()()()()"));
        System.out.println(isBalanced(")()()()("));
        System.out.println(isBalanced("((())())"));
        System.out.println(isBalanced("(((((())"));

    }


    public static boolean isBalanced(String inputString) {

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
            index++;
        }

        return openBrancesStake.empty();

    }
}