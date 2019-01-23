package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        int i=1, j =1;
        for(i=1; i<= 10; i++){
            for(j=1; j<= i; j++){
                System.out.print(8);


            }
            System.out.println();
            j=1;

        }

    }
}
