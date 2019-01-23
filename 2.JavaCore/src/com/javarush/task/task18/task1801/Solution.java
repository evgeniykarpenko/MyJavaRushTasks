package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0) {

            ar.add(inputStream.read());
        }
        inputStream.close();
        int MAX = 0;
        for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i)>MAX) MAX = ar.get(i);
        }
        System.out.println(MAX);
    }
}
