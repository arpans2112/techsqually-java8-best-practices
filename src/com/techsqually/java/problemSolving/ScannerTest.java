package com.techsqually.java.problemSolving;

import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        if (sc.hasNext() == false){
            System.out.println("End of Line");
        }


    }

}
