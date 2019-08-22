package com.techsqually.problemSolving;

public class StairCasePrintTest {


    public static void main(String[] args) {


        printStairCase(6);

        System.out.println("***********");

        printStairCaseUsingWhileLoop(6);



    }


    public static void printStairCase(int n){

        int k =1;
        int l = n;

        while(n>0){
            StringBuilder sb = new StringBuilder();
            int spacecount=l-k;
            int ladderCount=k;

            while(spacecount > 0 ){
                sb.append(" ");
                spacecount--;
            }
            while (ladderCount > 0){
                sb.append("#");
                ladderCount--;
            }
            k++;
            System.out.println(sb.toString());
            n--;
        }
    }

    public static void printStairCaseUsingWhileLoop(int n){

        for (int i = n ; i > 0; i--){
            StringBuffer sb = new StringBuffer();
            int spaceCount=i;
            while( spaceCount > 1){
                sb.append(" ");
                spaceCount--;
            }
            int ladderCount=n-i;
            while( ladderCount >= 0){
                sb.append("#");
                ladderCount--;
            }

            StringBuilder stringBuilder = new StringBuilder(sb);
            System.out.println(stringBuilder.toString());
        }

    }

}
