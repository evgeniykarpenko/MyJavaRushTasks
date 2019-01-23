package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
       String id = args[0];


        FileInputStream inputStream = new FileInputStream(new  BufferedReader(new InputStreamReader(System.in)).readLine() );
        byte[] buffer = new byte[inputStream.available()];
        while(inputStream.available()>0)
        {
        inputStream.read(buffer);

        }
        inputStream.close();
        int reindex=0;
        String str = new String(buffer);

        String[] masstr = str.split("\n");

        for (int i = 0; i < masstr.length; i++) {
            if(masstr[i].startsWith(id))
               reindex = i;
        }
        System.out.println(masstr[reindex]);

       // String[] masstrRez = masstr[reindex].split(" ");

    }
}
