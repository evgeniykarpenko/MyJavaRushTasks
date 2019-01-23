package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args)throws  Exception {

        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String f1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        FileOutputStream outputStream1 = new FileOutputStream(f1);


        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);

        inputStream.close();

        for (int i = buffer.length-1; i >= 0  ; i--) {
            outputStream1.write(buffer[i]);
        }
        outputStream1.close();




    }
}