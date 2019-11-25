package com.techsqually.java.datastructure.collections.maps.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class HashMapBasics {

   public static HashMap<String,Integer> phoneBook = new HashMap<>();

    public static void main(String[] args) {


  /*      adddingMultipleValues();
        System.out.println(returnRecord("Arpan"));*/
        computeIfAbsentMethodTest();
        adddingMultipleValues();

    }

     public static HashMap addPhoneNumber(String key, Integer value){
        phoneBook.putIfAbsent(key,value);
        return phoneBook;
     }



     public static String returnRecord(String key){
        return phoneBook.containsKey(key) ? key + "="+ phoneBook.get(key) : "Not Found";
     }

     public static HashMap adddingMultipleValues(){

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


        String keyValueCombinedString = newPhoneBook.entrySet().stream().
                               map(entrySet -> entrySet.getKey() + ":"+ entrySet.getValue()).
                               collect(Collectors.joining("," , "[","]"));




         System.out.println(keyValueCombinedString);

         /*
        * use of putAll funtion
        * */
        phoneBook.putAll(newPhoneBook);
        return phoneBook;
     }


     public static void computeIfAbsentMethodTest(){

        int count = 1;
         Map<String,LinkedList<String>> newPhoneBook = new HashMap<>();
        List<String> abc = newPhoneBook.computeIfAbsent("Arpan" + count , v -> {
             return new LinkedList<String>();
         });

         abc.add("Arpan");
         System.out.println(newPhoneBook);


     }

}
