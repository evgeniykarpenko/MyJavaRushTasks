package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
       list.add("мама");list.add("именно");
        list.add("мыла");list.add("именно");
        list.add("раму");list.add("именно");

        for(int i=0;i<list.size();i++)
        {

            System.out.println(list.get(i));
        }
    }
}


