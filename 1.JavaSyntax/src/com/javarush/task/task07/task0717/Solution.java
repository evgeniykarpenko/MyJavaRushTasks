package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++) {

            String s = r.readLine();
            list.add(s);




        }

        ArrayList<String> result = doubleValues(list);
        for(int i=0; i<result.size();i++) {

            System.out.println(result.get(i));
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<>();

        for(int i=0; i< list.size();i++) {

            list1.add(list.get(i));
            list1.add(list.get(i));





        }
        return list1;
    }
}
