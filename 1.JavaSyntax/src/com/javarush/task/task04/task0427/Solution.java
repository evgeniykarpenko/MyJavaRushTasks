package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        boolean f = (a%2 == 0);
        boolean d = (a > 0 && a < 10);
        boolean g = (a >= 10 && a < 100);
        boolean m = (a >= 100 && a <= 999 );
        if (a >= 1 || a <= 999) {
            if (f && d) {
                System.out.println("четное однозначное число");
            } else if (f && g) {
                System.out.println("четное двузначное число");
            } else if (f && m) {
                System.out.println("четное трехзначное число");
            } else if (a % 2 != 0 && d) {
                System.out.println("нечетное однозначное число");
            } else if (a % 2 != 0 && g) {
                System.out.println("нечетное двузначное число");
            } else if (a % 2 != 0 && m) {
                System.out.println("нечетное трехзначное число");
            }
        }

    }
}
