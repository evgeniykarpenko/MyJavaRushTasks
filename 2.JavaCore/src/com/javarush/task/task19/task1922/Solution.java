package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            int flag = 0;
            String[] sMas = s.split(" ");

            for (int i = 0; i < sMas.length; i++) {
                for (int j = 0; j < words.size(); j++) {
                    if (sMas[i].equals(words.get(j))) flag++;
                }
            }
            if (flag == 2)
                for (int i = 0; i < sMas.length; i++) {
                    System.out.print(sMas[i] + " ");
                }
            System.out.println();
        }
        fileReader.close();
        reader.close();

    }
}
