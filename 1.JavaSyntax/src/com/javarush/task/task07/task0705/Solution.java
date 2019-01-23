package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //  String[] mass = new String[10];
        int[] bmasi = new int[20];
        int[] masi1 = new int[10];
        int[] masi2 = new int[10];
        for(int i=0;i<bmasi.length;i++) {
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            bmasi[i] = n;


        }
        int l = bmasi.length/2;
       // System.out.println(l);
        for(int i=0;i<l;i++) {

            masi1[i]=bmasi[i];

        //    System.out.println(masi1[i]+"  --->1");

        }

        for(int i=0;i<l;i++) {

            masi2[i]=bmasi[i+l];

            System.out.println( masi2[i]);

        }
    }
}
