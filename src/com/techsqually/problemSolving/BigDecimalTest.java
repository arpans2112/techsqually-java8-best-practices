package com.techsqually.problemSolving;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        String[] sr = new String[number];
         int index = 0;
        while(number > 0){

            sr[index] = sc.nextLine();
            index++;
            number--;
        }

        //Soring using lambda funtion
        //Sorting a String array be comparing as BigdecimalValue
        Arrays.sort(sr, Collections.reverseOrder((a1, a2) -> {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
        }));



        /*//Sorting a String array be comparing as BigdecimalValue
        Arrays.sort(sr, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));*/

        for (String s: sr){

            System.out.println(s);
        }

    }

}
