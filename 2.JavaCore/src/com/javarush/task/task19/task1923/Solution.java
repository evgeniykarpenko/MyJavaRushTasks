package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        char a;
        while (reader.ready()) {
            String s = reader.readLine();

            String[] masS = s.split(" ");

            for (int i = 0; i < masS.length; i++) {
                if(!masS[i].matches("^\\D*$")) { fileWriter.write(masS[i]+ " "); }
            }
        }
        reader.close();
        fileWriter.close();
    }
}
