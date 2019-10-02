package com.techsqually.java.library.util;

import java.util.stream.Collectors;

public class StringTest {

    /**
     * 1.charAt(index) -> returns character can be compared by == 'char';
     * 2. "Hello".subString(int startIndexInclusive, int endIndexExclusive); index start from 0
     * e.g "Hello".subString(1,3) -> returns el endIndex is exclusive and
     * 3.
     */


    public static void main(String[] args) {

        String givenString = "asvkugfiugsalddlasguifgukvsa";
        System.out.println(findCharacter(givenString, 'A'));

        /*Returns 2*/
        System.out.println('c' - 'a');

        /*Sorted String : Aanpr , */
        String abc = "Arpan".chars().sorted().mapToObj(i -> (char) i).map(String::valueOf).collect(Collectors.joining());
        String reverseOfGivenString = givenString.chars().sorted().mapToObj(i -> (char) i).map(String::valueOf).collect(Collectors.joining());
        System.out.println(abc);
        System.out.println(reverseOfGivenString);


    }


    /**
     * TO check if a findChar is present in givenString or Not
     * @param givenString,findChar
     *        givenString is the string given in which we have to find the character given
     *        findChar
     * @return true if the character is found in the method
     *         false if the character is not found in the given String
     * */

    public static boolean findCharacter(String givenString, char findChar) {

        boolean found = false;
        int n = givenString.length();
        int start = 0;
        while (n-- > 0) {

            if (!found) {
                if (givenString.charAt(start) == findChar) {
                    found = true;
                }
                start++;
            } else break;
        }

        return found;
    }


}
