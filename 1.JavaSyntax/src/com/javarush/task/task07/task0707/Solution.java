package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list= new ArrayList();
     //   for(int i = 0; i < 5; i++)
            list.add("1");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("41");
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
