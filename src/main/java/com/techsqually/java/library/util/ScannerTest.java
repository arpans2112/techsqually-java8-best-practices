package com.techsqually.java.library.util;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        BitSet first = new BitSet(m);
        BitSet second = new BitSet(m);

        while(n > 0){

            String data = sc.nextLine();
            String[] dataArray = data.split(" ");
            switch (dataArray[0]){

                case "AND":
                    if (dataArray[1].equals("1")){
                        first.and(second);
                    }else {
                        second.and(first);
                    }
                    break;
                case "OR":
                    if (dataArray[1].equals("1")){
                        first.or(second);
                    }else {
                        second.or(first);
                    }
                    break;
                case "XOR":
                    if (dataArray[1].equals("1")){
                        first.xor(second);
                    }else {
                        second.xor(first);
                    }
                    break;
                case "FLIP":
                    if (dataArray[1].equals("1")){
                        first.flip(Integer.parseInt(dataArray[2]));
                    }else {
                        second.flip(Integer.parseInt(dataArray[2]));
                    }
                    break;
                case "SET":
                    if (dataArray[1].equals("1")){
                        first.set(Integer.parseInt(dataArray[2]));
                    }else {
                        second.set(Integer.parseInt(dataArray[2]));
                    }
                    break;
            }

            System.out.println(first.cardinality() + " " + second.cardinality());
            n--;
        }

    }
}
