package com.javarush.task.task04.task0425;

/* 
Цель установлена!
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
        if((a>0)&&(b>0))System.out.print(1);
        if((a<0)&&(b>0))System.out.print(2);
        if((a<0)&&(b<0))System.out.print(3);
        if((a>0)&&(b<0))System.out.print(4);

    }
}
