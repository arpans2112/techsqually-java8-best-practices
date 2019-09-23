package com.techsqually.java.problemSolving.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class WeightedUniformStrings {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(weightedUniformStrings("aaabbbbcccddd", new int[]{5, 9, 7, 8, 12, 5})));


    }


    static String[] weightedUniformStrings(String s, int[] queries) {


        String[] results = new String[queries.length - 1];


        LinkedHashSet<Integer> weightSet = new LinkedHashSet<>();
        int uniformStartIndex = 0;

        for (int x = 0; x < s.length() - 1; x++) {
            if (s.charAt(x) != s.charAt(x + 1)) {
                weightSet.addAll(weightSetOfContStr(s.substring(uniformStartIndex, x + 1)));
                uniformStartIndex = x + 1;
            }

            if (x == s.length() - 2) {
                weightSet.addAll(weightSetOfContStr(s.substring(uniformStartIndex, x + 2)));
            }

        }

        for (int query = 1; query < queries.length; query++) {
            String result = weightSet.contains(queries[query]) ? "Yes" : "No";
            results[query - 1] = result;

        }
        return results;
    }


    public static int weightOfGivenString(HashMap<Character, Integer> weightedMap, String givenString) {

        int totalWeight = 0;
        for (int index = 0; index < givenString.length(); index++) {
            totalWeight += weightedMap.get(givenString.charAt(index));
        }
        return totalWeight;
    }


    public static HashSet<Integer> weightSetOfContStr(String givenString) {

        int startIndex = 1;
        HashMap<Character, Integer> weightedMap = new HashMap<>();
        for (char a = 'a'; a <= 'z'; a++, startIndex++) {
            weightedMap.put(a, startIndex);
        }

        HashSet<Integer> weightedSet = new HashSet<>();


        /**To get all possible continuous substrings of a given String
         * e.g abc  : a : ab : abc : b : bc : c
         *
         * */
        for (int var1 = 0; var1 < givenString.length(); var1++) {

            for (int var2 = var1 + 1; var2 <= givenString.length(); var2++) {
                weightedSet.add(weightOfGivenString(weightedMap, givenString.substring(var1, var2)));
            }
        }

        return weightedSet;
    }


}