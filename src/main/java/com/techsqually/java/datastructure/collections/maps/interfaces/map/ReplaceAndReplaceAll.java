package com.techsqually.java.datastructure.collections.maps.interfaces.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceAndReplaceAll {

    public static void main(String[] args) {


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


        /** Replace all is used when you have to replace each value of hashMap with a new value*/
        charCount.replaceAll((key,value) -> value+1);
        System.out.println(charCount);


        System.out.println("copy map test");
        Map<Character,Integer> copyMap = new HashMap<>(charCount);
        copyMap.replace('p' ,3);
        System.out.println(charCount);
        System.out.println(copyMap);
    }
}
