package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double time = Double.parseDouble(s);

        double count = 0;


        while (true) {
            if (time >= count && time < count + 3) {
                System.out.println("зелёный");
                break;
            }
            if (time >= count + 3 && time < count + 4) {
                System.out.println("желтый");
                break;
            }
            if (time >= count + 4 && time < count + 5) {
                System.out.println("красный");
                break;
            }
            count = count + 5;
        }
    }
}