package com.techsqually.java.datastructure.collections.maps.interfaces.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MergeMethodApp {

    public static void main(String[] args) {

        /** Merge is used if the value doesn't exist add with the default value
         * if present then do some calculation and then add in the map
         * */

        HashMap<Character, Integer> charCount = new LinkedHashMap<>();
        String givenName = "arpan";

        /** if key doesn't exist  then add key and value, if the key value alaredy exist then you can manipulate
         * using Bifuntion method
         * */

        givenName.chars().forEach(c -> {
            charCount.merge((char) c, 1, ((key, value) -> value + 1));

        });

        System.out.println(charCount);

        /** if the key and value pair matched then only replace value*/
        /*replaced in below scenario
        * old and new values after remove
        * {a=2, r=1, p=1, n=1} - old
        * {a=2, r=3, p=1, n=1} - new
        *
        * */
        charCount.replace('r', 1,3);

        /** Not replaced */
        charCount.replace('a', 1, 4);

     /** if key doesn't exist if doesn't do anything*/
        charCount.replace('l', 1, 3);
        System.out.println(charCount);



    }

}