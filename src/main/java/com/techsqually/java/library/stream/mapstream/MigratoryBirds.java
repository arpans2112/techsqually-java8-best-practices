package com.techsqually.java.library.stream.mapstream;

import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {


    public static void main(String[] args) {

      List<Integer> abc = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));

      migratoryBirds(abc);
    }


    static int migratoryBirds(List<Integer> arr) {


        HashMap<Integer, Integer> abc = new HashMap<>();

        arr.stream().distinct().forEach(i -> {
            abc.put(i, Collections.frequency(arr,i));
        });

        int maxkey = abc.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        abc.entrySet().stream().filter(entry -> entry.getValue() == Collections.max(abc.values())).map(Map.Entry::getKey)
                .collect(Collectors.toList()).stream().map(Integer::intValue).min(Integer::compareTo);

       int min = abc.entrySet().stream().filter(entry -> entry.getValue() == Collections.max(abc.values())).min(Map.Entry.comparingByKey()).get().getKey();

     return min;
    }


}
