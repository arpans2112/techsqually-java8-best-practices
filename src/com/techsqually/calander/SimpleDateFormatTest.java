package com.techsqually.calander;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        //Get Current date and Time
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddyyyy_HHmmss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}
