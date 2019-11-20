package com.techsqually.java.datastructure.collections.maps.interfaces.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class computeMethodApp {

    public static void main(String[] args) {


        /** if the key doesn't exist or has null value then if you wanna do different operations you can use compute*/

        String givenString = "arpan";
        Map<Character,Integer> givenMap = new LinkedHashMap<>();

        givenString.chars().forEach(c -> {
            givenMap.compute((char)c, (k,v) -> (v == null) ? 1 : v+1);
        });

        System.out.println(givenMap);

    }


}
