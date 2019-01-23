package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++) {

            String s = r.readLine();
            list.add(s);
        }
        int curs = 0;
        for(int i=0; i< list.size();i++) {

            if(curs <  list.get(i).length()) {
                curs = list.get(i).length();
          //      System.out.println(curs);
            }

            else {System.out.println(i);break;}

        }

    }
}

