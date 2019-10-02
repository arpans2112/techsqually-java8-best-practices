package com.techsqually.java.language.breakstatement;

public class breakblocks {


    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {

            outer:
            for (int j = 0; j < 100; j++) {

                for (int z = 0; z < 100; z++) {

                    if (i == j && j == z) {
                        System.out.println(i + " : " + j + ":" + z);
                        break outer;
                    }
                }

            }


        }
    }


}
