package com.techsqually.problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryTest {

    public static String updatedList = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfInteger = sc.nextInt();
        List<Integer> givenArrayList = new ArrayList<Integer>();
        sc.nextLine();

        while(numberOfInteger > 0){
            givenArrayList.add(sc.nextInt());
            numberOfInteger--;
        }
        sc.nextLine();

        int numberOfQueries = sc.nextInt();
        sc.nextLine();

        while(numberOfQueries > 0){

            String queryType = sc.nextLine();
            int index = sc.nextInt();
            if(queryType.equals("Insert")) {
                int element = sc.nextInt();
                givenArrayList.add(index ,element);
            }else if (queryType.equals("Delete"))
                givenArrayList.remove(index);
            if(sc.hasNext()) sc.nextLine();
            numberOfQueries--;
        }

        givenArrayList.forEach(k ->{
            updatedList += k + " ";
        });
        System.out.println(updatedList.trim());


    }

}
