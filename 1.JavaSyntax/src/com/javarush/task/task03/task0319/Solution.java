package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        String sAge2 = reader.readLine();
        int nAge2 = Integer.parseInt(sAge2);
        System.out.println( name + " получает " + nAge +" через "  + nAge2 + " лет.");
    }
}
