package com.javarush.task.task13.task1318;

import java.io.*;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName = reader.readLine();


        InputStream fileInputStream = new FileInputStream(FileName);
    //    BufferedReader br = new BufferedReader( new InputStreamReader(fileInputStream));
     //   BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
        String line;
        while (fileInputStream.available()>0){
            System.out.print((char)fileInputStream.read());
        }
        System.out.println();
        reader.close();
        fileInputStream.close();

    }
}