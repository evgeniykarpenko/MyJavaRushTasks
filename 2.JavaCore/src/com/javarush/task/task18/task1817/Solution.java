package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileNameIn = args[0];
        FileInputStream inputStream =new FileInputStream(fileNameIn);


        int count1 =0, count2 = 0;
        while(inputStream.available()>0)
        {

            int code = inputStream.read();
            //      System.out.println(code);
            if (code==32) {count1 ++; count2++;}
            else count2 ++;

        }

        inputStream.close();

        double res = ( (double)count1/(double)count2)*100;

        System.out.format("%.2f%n", res);
    }
}
