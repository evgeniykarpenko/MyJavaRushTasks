package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<5;i++) {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String s = r.readLine();
            list.add(s);

        }
        int MaxStr = list.get(0).length();
        for(int i=0; i<list.size();i++) {
           if((list.get(i)).length() > MaxStr)
               MaxStr = list.get(i).length();
        }

        for(int i=0; i<list.size();i++) {
            if((list.get(i)).length() == MaxStr)

            System.out.println(list.get(i));
        }

    }
}
