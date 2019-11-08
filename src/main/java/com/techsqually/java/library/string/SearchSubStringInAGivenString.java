package com.techsqually.java.library.string;

public class SearchSubStringInAGivenString {


    public static void main(String[] args) {

        String getIndexOfSpaces = "My Name is Arpan Saini";


        System.out.println(getIndexOfSpaces.lastIndexOf(' ')); //returns index , start search from right to left
        System.out.println(getIndexOfSpaces.indexOf(' ')); //returns index , start search from left to right

        /**
         *
         * different form of Search algorithm, if the character or String is not found
         * in the given string it will return -1 else it will return the index of the startString or character
         * indexOf(char)
         * indexOf(String)
         * indexOf(String, stratIndex)
         * indexOf(c, stratIndex)
         * lastIndexOf(char)
         * lastIndexOf(String)
         * lastIndexOf(String, stratIndex)
         * lastIndexOf(c, stratIndex)
         *
         * */

      /** Alorithm to search all spaces in a given String*/

        int searchFrom = 0;
        for (int i = searchFrom ; searchFrom < getIndexOfSpaces.length(); i++){
            int indexOfSpace = getIndexOfSpaces.indexOf(" ",searchFrom);
            if (indexOfSpace == -1) break;
            System.out.println(indexOfSpace);
            searchFrom = indexOfSpace+1;
        }

    }
}
