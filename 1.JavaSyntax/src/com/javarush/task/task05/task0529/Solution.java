package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try {
        while(true) {

            String s = reader.readLine();
            if (!(s.equals("сумма"))) {
                int N = Integer.parseInt(s);
                sum += N;
            } else {
                System.out.print(sum);
                break;
            }
        }
        }catch (IOException ex) {
            System.out.println (ex.toString());

        }



    }
}
