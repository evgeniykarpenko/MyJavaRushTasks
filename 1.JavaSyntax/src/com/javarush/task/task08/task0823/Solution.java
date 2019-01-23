package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] c = s.toCharArray();
        if (Character.isLetter(c[0]))
            c[0] = Character.toUpperCase(c[0]);
        for (int i = 0; i < s.length() - 1; i++)
            if (c[i] == ' ' && Character.isLetter(c[i + 1]))
                c[i + 1] = Character.toUpperCase(c[i + 1]);
        System.out.println(new String(c));
    }
}
