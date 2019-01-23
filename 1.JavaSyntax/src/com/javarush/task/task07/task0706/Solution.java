package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //  String[] mass = new String[10];
        int[] bmasi = new int[15];

        for(int i=0;i<bmasi.length;i++) {
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            bmasi[i] = n;
                    }
        int n =0;
        int c = 0;
        for(int i=0;i<bmasi.length;i++) {

            if(i%2==0) c+=bmasi[i];
            else n+=bmasi[i];
        }
        if(n>c)
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
