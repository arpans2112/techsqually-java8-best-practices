package com.techsqually.java.datastructure.collections.maps.hashmap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class CollectorsJoiningOfMapEntries {


    public static void main(String[] args) {


        HashMap<String,Integer> newPhoneBook = new HashMap(){{
            putIfAbsent("Arpan",80186787);
            putIfAbsent("Sanjay",80186788);
            putIfAbsent("Kiran",80186789);
            putIfAbsent("Pranjay",80186790);
            putIfAbsent("Jaiparkash",80186791);
            putIfAbsent("Maya",80186792);
            putIfAbsent("Rythem",80186793);
            putIfAbsent("Preeti",80186794);

        }};


        /**Compining Key and Value pairs and then separate each pair by some delimiter and the add prefix and Suffix*/
        String keyValueCombinedString = newPhoneBook.entrySet().stream().
                map(entrySet -> entrySet.getKey() + ":"+ entrySet.getValue()).
                collect(Collectors.joining("," , "[","]"));
        System.out.println(keyValueCombinedString);

        /**
         *  OUTPUT : [Kiran:80186789,Arpan:80186787,Pranjay:80186790,Jaiparkash:80186791,Maya:80186792,Sanjay:80186788,Preeti:80186794,Rythem:80186793]
         *
         * */


        String keyValueCombinedString1 = newPhoneBook.entrySet().stream().
                map(Objects::toString).
                collect(Collectors.joining("," , "[","]"));
        System.out.println(keyValueCombinedString1);

        /**
         * Objects::toString method concate key and value pairs by =
         * OUTPUT : [Kiran=80186789,Arpan=80186787,Pranjay=80186790,Jaiparkash=80186791,Maya=80186792,Sanjay=80186788,Preeti=80186794,Rythem=80186793]
         * */

    }
}
