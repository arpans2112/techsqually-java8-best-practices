package com.techsqually.java.problemSolving.HackerRank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaMd5 {


    public static void main(String[] args) throws NoSuchAlgorithmException {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        


        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }

}
