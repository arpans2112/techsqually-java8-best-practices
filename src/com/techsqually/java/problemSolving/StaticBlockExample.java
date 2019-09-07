package com.techsqually.java.problemSolving;

import java.util.Scanner;




public class StaticBlockExample {
    static int B=0,H=0;
    static boolean flag =false;

    static {

         Scanner sc = new Scanner(System.in);
         B = sc.nextInt();
         H = sc.nextInt();
//        boolean flag = false;
        if (B < 0 || H < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        } else {
            flag = true;
        }


    }


    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }

}





