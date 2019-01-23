package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int d = Integer.parseInt(s3);
        int max1,max2;
        if  (a > b) max1 = a; else max1 = b;
        if  (c > d) max2 = c; else max2 = d;
        if  (max1 > max2)System.out.println(max1);
        else System.out.println(max2);
    }
}
