package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();

        String s1 = r.readLine();
        Integer N = Integer.parseInt(s1);
        String s2 = r.readLine();
        Integer  M = Integer.parseInt(s2);

        for(int i=0; i<N;i++) {

            String s = r.readLine();
            list.add(s);

        }

        for(int i=0; i<M;i++) {

            list.add(list.get(0));list.remove(0);

        }



        for(int i=0; i<list.size();i++) {

            System.out.println(list.get(i));

        }
    }
}
