package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int i=0;
        if(a>0) i++;
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);
        if(b>0) i++;
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);
        if(c>0) i++;
        System.out.println(i);
    }
}
