package com.techsqually.java.problemSolving.strings;

public class AlternatingCharacters {


    public static void main(String[] args) {


    }


    static int alternatingCharacters(String s) {

        if (s.length() == (int) s.chars().filter(i -> (char) i == 'A').count()
                || s.length() == (int) s.chars().filter(i -> (char) i == 'B').count()) {
            return s.length();
        }

        StringBuilder sb = new StringBuilder(s);

        int startIndex = 0;
        while (startIndex++ < s.length()) {
            if (s.charAt(startIndex) == s.charAt(startIndex)) {
                if (sb.length() != 2)
                    sb.deleteCharAt(startIndex);
                else {
                    sb.delete(startIndex, startIndex + 2);
                }
            }

        }

        return 0;
    }
}
