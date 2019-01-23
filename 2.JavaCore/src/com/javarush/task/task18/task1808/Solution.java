package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args)throws  Exception {

        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String f1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        String f2 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        FileOutputStream outputStream1 = new FileOutputStream(f1);
        FileOutputStream outputStream2 = new FileOutputStream(f2);

        while(inputStream.available()>0)
        {
            byte[] buffer = new byte[inputStream.available()];
            int startCount = (inputStream.read(buffer));
            if(startCount % 2 ==0) {
                outputStream1.write(buffer, 0, startCount/2);
                outputStream2.write(buffer, startCount/2, startCount/2);
            }
            else
            {
                outputStream1.write(buffer, 0, (startCount+1)/2);
                outputStream2.write(buffer, (startCount+1)/2, startCount/2);
            }

        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();



    }
}