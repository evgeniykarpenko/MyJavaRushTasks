package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  String[] mass = new String[10];
        int[] masi = new int[10];
        for(int i=0;i<masi.length;i++) {
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            masi[i] = n;


        }

        for(int i=masi.length-1;i>=0;i--) {



            System.out.println( masi[i]);

        }
    }
}

