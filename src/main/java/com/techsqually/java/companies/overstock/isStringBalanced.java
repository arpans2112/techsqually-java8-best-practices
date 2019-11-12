package com.techsqually.java.companies.overstock;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class isStringBalanced {


    public static void main(String[] args) {

        Assert.assertEquals(ValidateString("<<>>{}") ,true);
        Assert.assertEquals(ValidateString("<<(>)>{}") ,false);
        Assert.assertEquals(ValidateString("<<{}>>") ,true);
        Assert.assertEquals(ValidateString("()()()()") ,isBalanced("()()()()"));
        Assert.assertEquals(ValidateString(")()()()(") ,isBalanced(")()()()("));
        Assert.assertEquals(ValidateString("((())())") ,isBalanced("((())())"));
        Assert.assertEquals(ValidateString("(((((())") ,isBalanced("(((((())"));

    }

    static boolean ValidateString(String input) {
        /*
         * Write your code here.
         */

        ArrayList<Character> openBrances = new ArrayList<>(Arrays.asList('(', '{', '[','<'));
        ArrayList<Character> closeBrances = new ArrayList<>(Arrays.asList(')', '}', ']','>'));

        if (input.isEmpty()) {
            return true;
        } else if (closeBrances.contains(input.charAt(0))) {
            return false;
        }


        Stack<Character> balancedStrings = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char indexChar = input.charAt(i);
            if (openBrances.contains(indexChar)) {
                balancedStrings.push(input.charAt(i));
            } else {

                switch (indexChar) {
                    case ')':
                        if (balancedStrings.peek() == '(') {
                            balancedStrings.pop();
                        }
                        break;
                    case '}':
                        if (balancedStrings.peek() == '{') {
                            balancedStrings.pop();
                        }
                        break;
                    case ']':
                        if (balancedStrings.peek() == '[') {
                            balancedStrings.pop();
                        }
                        break;
                    case '>':
                        if (balancedStrings.peek() == '<') {
                            balancedStrings.pop();
                        }
                        break;
                    default:
                        return false;


                }


            }

        }

        return balancedStrings.empty();
    }

    public static boolean isBalanced(String inputString) {

        boolean isBlanced = false;
        Stack openBrancesStake = new Stack();
        int index = 0;
        while (index < inputString.length()) {

            if (inputString.charAt(index) == '(') openBrancesStake.push("(");
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
