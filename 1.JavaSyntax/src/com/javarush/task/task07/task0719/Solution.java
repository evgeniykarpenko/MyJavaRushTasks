package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>();
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    for(int i=0; i<5;i++) {

        String s = r.readLine();
        Integer n = Integer.parseInt(s);
        list.add(n);
    }

    for(int i=list.size()-1; i>=0;i--) {

        System.out.println(list.get(i));

    }
    //напишите тут ваш код
}
}