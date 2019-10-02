package com.techsqually.java.problemSolving.strings;

import java.util.Stack;
import java.util.stream.Collectors;

public class SupperReducedString {

    public static void main(String[] args) {

//        System.out.println(superReducedString("aa"));;

   /*     System.out.println(superReducedStringUsingStack("aaabccddd"));
        System.out.println(superReducedStringUsingStack("aa"));
        System.out.println(superReducedStringUsingStack("abba"));*/

        System.out.println(superReducedStringUsingStack("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));


    }

    static String superReducedString(String s) {

        String shortestString = "";
        StringBuilder stringBuilder = new StringBuilder(s);

        int startIndex = 0;
        while (startIndex < stringBuilder.length() - 1) {

            if (stringBuilder.length() == 0 || stringBuilder.length() == 1) {
                return stringBuilder.toString();
            }


            if (stringBuilder.charAt(startIndex) == stringBuilder.charAt(startIndex + 1)) {
                stringBuilder.delete(startIndex, startIndex + 2);
                startIndex = 0;
            } else {
                startIndex++;
            }

        }

        return stringBuilder.length() == 0 ? "Empty String" : stringBuilder.toString();

    }


    /*
     * Can't be done with single complexity as if you push the stacks and later it have duplicate values together
     * then it will have on stack
     *
     * */
    public static String superReducedStringUsingStack(String s) {

        String returnString = s;
        if (s.length() == 0) {
            return "Empty String";
        } else if (s.length() == 1) {
            return s;
        }

        Stack<Character> characters = new Stack<>();

        int startIndex = 0;

        while (startIndex < s.length() - 1) {


            if (s.charAt(startIndex) == s.charAt(startIndex + 1)) {
                startIndex = startIndex + 2;
            }

            if (startIndex > s.length() - 1) {
                break;
            } else if (startIndex == s.length() - 1) {
                addElement(characters, s.charAt(startIndex));
                break;
            } else if (startIndex == s.length() - 2) {
                addElement(characters, s.charAt(startIndex));
                addElement(characters, s.charAt(startIndex + 1));
                break;
            } else {
                addElement(characters, s.charAt(startIndex));
                startIndex++;
            }

        }

        if (characters.isEmpty()) {
            return "Empty String";
        } else {
            return characters.stream().map(String::valueOf).collect(Collectors.joining());
        }
    }

    public static void addElement(Stack<Character> stack, char a) {
        if (!stack.isEmpty() && stack.peek() == a) {
            stack.pop();
        } else {
            stack.push(a);
        }
    }

}
