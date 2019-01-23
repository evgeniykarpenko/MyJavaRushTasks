package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mass = new String[10];
        int[] masi = new int[10];
        for(int i=0;i<mass.length;i++) {
            String s = reader.readLine();

            mass[i] = s;
            masi[i]=s.length();

        }

        for(int i=0;i<mass.length;i++) {



            System.out.println( masi[i]);

        }
    }
}
