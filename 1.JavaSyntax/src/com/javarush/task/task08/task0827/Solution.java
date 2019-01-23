package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("MAY 2 2013"));


    }

    public static boolean isDateOdd(String date)
    {   int dayCount = 0;
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        Date someDate;
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d yyyy", Locale.UK);
        try {
            someDate = sdf.parse(date);
            yearStartTime.setYear(someDate.getYear());

            long msTimeDistance = someDate.getTime() - yearStartTime.getTime();
            long msDay = 24 * 60 * 60 * 1000;

            dayCount = (int) (msTimeDistance/msDay);


        } catch (ParseException e) {
                    }
      //  System.out.println("Days from start of year: " + dayCount);
        if(dayCount%2 == 0) return false;
        else
        return true;
    }

}
