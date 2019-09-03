package com.techsqually.problemSolving.HackerRank.deque;

import com.techsqually.datastructure.collections.queue.deque.ArrayDequeBasics;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class JavaDequeue {



    public static void main(String[] args) {

        /*
        * Type of deque is need to define otherwise subList function doesn't work
        * */
         ArrayDeque<Integer> deque = (ArrayDeque) ArrayDequeBasics.addListToDeque(Arrays.asList(5, 3, 5, 2, 3, 2));

//         Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(5, 3, 5, 2, 3, 2));
         int m = 3;

        int maxUnique = Integer.MIN_VALUE;


        for(int j = 0 ; j <= deque.size()-m; j++){

            int distinctCount =  (int)deque.stream().collect(Collectors.toList()).subList(0,j+m).stream().distinct().count();

            if(distinctCount > maxUnique) maxUnique = distinctCount;

        }

        System.out.println(maxUnique);

    }


}
