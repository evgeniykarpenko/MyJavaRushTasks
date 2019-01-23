package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()) {
            String s = reader.readLine();

            String[] masS = s.split(" ");

            for (int i = 0; i < masS.length; i++) {
                if(masS[i].length()>6) {
                  stringBuilder.append(masS[i]+",");
                }
            }
        }

        String result = stringBuilder.toString().substring(0,stringBuilder.length()-1);
        fileWriter.write(result);
        reader.close();
        fileWriter.close();
    }
}
