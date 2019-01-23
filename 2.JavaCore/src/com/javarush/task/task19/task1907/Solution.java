package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileInName = reader.readLine();
        reader.close();
        reader.close();
        StringBuilder s = new StringBuilder();
        FileReader fileReader = new FileReader(fileInName);

        while (fileReader.ready()) {

            s.append((char)fileReader.read());

        }
        String[] masStr = s.toString().split("\\W");
        int count = 0;
        for (int i = 0; i < masStr.length; i++) {
            if("world".equals(masStr[i]))
                count++;

        }

        fileReader.close();

        System.out.println(count);
    }
}
