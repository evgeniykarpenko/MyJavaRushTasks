package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double sum = 0;
                int count =0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int a = Integer.parseInt(s);

            if(a==-1) break;
            sum+=a;count ++;


        }System.out.println(sum/count);
    }
}

