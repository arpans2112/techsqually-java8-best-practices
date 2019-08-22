package com.techsqually.filereader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadAFileInList {


    public static void main(String[] args) throws Exception {
        List dataLines = readFileInList("D:\\Automation_Project\\docusign-proximity-assignment\\src\\main\\resources\\data\\input.txt");


        System.out.println("Read data as List");
        dataLines.forEach(x -> {
            System.out.println(x);
        });

        System.out.println("Read data as String");
        String data = readFileAsString("D:\\Automation_Project\\docusign-proximity-assignment\\src\\main\\resources\\data\\input.txt");
        System.out.println(data);
        String[] words = data.split(" ");

        System.out.println("Printing Words");
        for (String s : words){
            System.out.println(s);
        }

    }



    public static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e)
        {
            // do something
            e.printStackTrace();
        }
        return lines;
    }


    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
