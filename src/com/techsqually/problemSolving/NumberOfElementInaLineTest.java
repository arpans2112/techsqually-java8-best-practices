package com.techsqually.problemSolving;

import java.io.*;
import java.util.*;

public class NumberOfElementInaLineTest {

        public static int lineNumber = 0;
        public static int elementNumber = 0;
        public static String abc = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());
        ArrayList<Object> integerReference = new ArrayList<Object>();
        ArrayList<Object> queryReference = new ArrayList<Object>();


        while(numberOfLines > 0){

            String d = sc.nextLine();
            ArrayList<String> numberofInteger = new ArrayList<String>();

            String[] elements = d.split(" ");
            for(String s : elements){
                numberofInteger.add(s);
            }

            integerReference.add(numberofInteger);
            numberOfLines--;
        }

        int numberOfQueries = Integer.parseInt(sc.nextLine());

        while(numberOfQueries > 0){

            String d = sc.nextLine();
            ArrayList<String> numberofqueries = new ArrayList<String>();
            String[] elements =  d.split(" ");

            for(String s : elements){
                numberofqueries.add(s);
            }

            queryReference.add(numberofqueries);
            numberOfQueries--;
        }


        queryReference.forEach(k -> {

            try{

              lineNumber =  Integer.parseInt(((ArrayList) k).get(0).toString());
              elementNumber =  Integer.parseInt(((ArrayList) k).get(1).toString());

                System.out.println(((ArrayList)integerReference.get(lineNumber-1)).get(elementNumber));


            }catch(Exception e){

                System.out.println("ERROR!");
            }

        });

    }
}

