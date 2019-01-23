package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s ="";
        int sum = 1;
        for (   int j = 1; j<= 10; j++)
        {
            for (int i = 1; i <= 10; i++)
            {
                s = s + " " + i*j;
            }

            System.out.println(s);
            s="";
        }
    }
}
