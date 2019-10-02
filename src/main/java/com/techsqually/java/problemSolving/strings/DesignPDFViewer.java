package com.techsqually.java.problemSolving.strings;

public class DesignPDFViewer {

    public static int index;
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {

        int[] chars = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};

        System.out.println(designerPdfViewer(chars, "zaba"));


    }

    static int designerPdfViewer(int[] h, String word) {

        word.chars().forEach(c -> {

            index = 26 - ((int) 'z' - c);
            if (h[index - 1] > max) max = h[index - 1];

        });
        return word.length() * max;

    }

}
