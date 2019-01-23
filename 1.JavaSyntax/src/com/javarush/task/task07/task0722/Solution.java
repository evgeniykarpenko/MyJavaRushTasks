package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;;i++) {

            String s = r.readLine();

            if(s.equals("end")) break;
            else list.add(s);

        }

        for(int i=0; i< list.size();i++) {

            System.out.println(list.get(i));

        }
    }
}