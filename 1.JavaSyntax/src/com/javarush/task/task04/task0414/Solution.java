package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        int x=365;
        if(( i%4==0 && i%400==0) && i%100!=0 ) x = 366;
           System.out.println("количество дней в году: " +x );
    }
}