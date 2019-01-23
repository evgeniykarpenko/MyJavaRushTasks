package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileNameIn = args[0];
        FileInputStream inputStream =new FileInputStream(fileNameIn);


        int count =0;
        while(inputStream.available()>0)
        {

            int code = inputStream.read();
      //      System.out.println(code);
                if ((code>=65&&code<=90)||(code>=97&&code<=122))
                    count ++;
        }

        inputStream.close();


        System.out.println(count);
    }
}
