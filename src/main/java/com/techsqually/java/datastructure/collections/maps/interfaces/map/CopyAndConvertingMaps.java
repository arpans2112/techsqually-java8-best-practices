package com.techsqually.java.datastructure.collections.maps.interfaces.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CopyAndConvertingMaps {


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

        /** Copy and Converting LinkedHashMap to map and printing*/
        System.out.println("copy map test");
        Map<Character,Integer> copyMap = new HashMap<>(charCount);
        copyMap.replace('p' ,3);
        System.out.println(charCount);
        System.out.println(copyMap);

    }


}
