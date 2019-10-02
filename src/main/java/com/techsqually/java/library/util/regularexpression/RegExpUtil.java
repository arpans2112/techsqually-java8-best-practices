package com.techsqually.java.library.util.regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpUtil {

    public static void main(String[] args) {

        System.out.println(matchCount("this is java,do you know java", "java"));
        System.out.println(startIndexOfPatternMatch("java", "this is java,do you know java"));
        System.out.println(endIndexOfPatternMatch("java", "this is java,do you know java"));
//        getMatchGroupList("this is java,do you know java","java");

        System.out.println(matchCount("arpancounttesta", "[a]+"));


    }


    public static int matchCount(String givenString, String regExp) {

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(givenString);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }


    /**
     * @param regularExpression : passed the sub string that you want to find out in the given String
     * @param givenString       : is the string in which you want to find out the sub string.
     * @return ArrayList<Integer></> that will return the list of start index of the all the sub string in a Given String
     */
    public static ArrayList<Integer> startIndexOfPatternMatch(String regularExpression, String givenString) {

        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(givenString);

        ArrayList<Integer> startIndexList = new ArrayList<>();
        while (matcher.find()) {
            startIndexList.add(matcher.start());
        }
        return startIndexList;
    }

    /**
     * @param regularExpression : passed the sub string that you want to find out in the given String
     * @param givenString       : is the string in which you want to find out the sub string.
     * @return ArrayList<Integer></> that will return the list of end index of the sub string in a Given String
     */
    public static ArrayList<Integer> endIndexOfPatternMatch(String regularExpression, String givenString) {

        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(givenString);
        ArrayList<Integer> endIndexList = new ArrayList<>();
        while (matcher.find()) {
            endIndexList.add(matcher.end());
        }
        return endIndexList;
    }


    public static List<String[]> getMatchGroupList(String text, String regExp) {

        List<String[]> res = new ArrayList<>();
        Pattern pattern = Pattern.compile(regExp, 42);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String[] s = new String[matchCount(text, regExp)];
            for (int i = 1; i < s.length; i++) {
                s[i - 1] = matcher.group(i);
            }
            res.add(s);
        }
        return res;
    }

}



