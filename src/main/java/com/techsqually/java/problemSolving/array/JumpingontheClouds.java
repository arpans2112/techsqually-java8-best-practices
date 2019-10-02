package com.techsqually.java.problemSolving.array;

public class JumpingontheClouds {

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));

    }


    static int jumpingOnClouds(int[] c) {


        if (c.length == 2) return 1;

        int jumpIndex = 0;
        int step = 0;

        while (jumpIndex + 2 < c.length || jumpIndex + 1 < c.length) {

            if (jumpIndex + 1 == c.length - 1) {
                return step + 1;
            }

            jumpIndex = c[jumpIndex + 2] == 0 ? jumpIndex + 2 : jumpIndex + 1;
            step++;

            if (jumpIndex == c.length - 1) {
                break;
            }

        }
        return step;

    }

}
