package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код


              if(centimetre < 100) return 0;else
            return (centimetre-(centimetre%100))/100;


    }
}