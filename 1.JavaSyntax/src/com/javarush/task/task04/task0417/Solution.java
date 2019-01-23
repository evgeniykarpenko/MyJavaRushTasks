package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if ((a == c) && (a == b)) System.out.println(a + " " + a + " " + a);
        else if ((a == c) || (a == b)) System.out.println(a + " " + a);
        else if (b == c) System.out.println(b + " " + b);
    }
}