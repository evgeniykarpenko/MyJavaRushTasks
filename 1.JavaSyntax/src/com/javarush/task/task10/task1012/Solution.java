package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        Integer[] chislobukv = new Integer[33];
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int count = 1;
        for(int i = 0; i< 33; i++)
            chislobukv[i]=0;
        for(int i = 0; i< list.size(); i++)
        {
            char[] strok = (list.get(i)).toCharArray();
            for (int j = 0; j<strok.length;j++)
            {
                for (int k=0;k<alphabet.size();k++)
                    if( alphabet.get(k)==(strok[j])) chislobukv[k] = count + chislobukv[k];
               // System.out.println(strok[j]);
            }
        }

        // напишите тут ваш код
        for(int i = 0; i< 33; i++)
            System.out.println(alphabet.get(i) + " "+ chislobukv[i]);
    }

}
