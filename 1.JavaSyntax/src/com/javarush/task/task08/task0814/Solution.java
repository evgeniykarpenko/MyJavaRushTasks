package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> ss = new HashSet<Integer>();
        for(int i=0; i< 20; i++)
            ss.add(i);


        return  ss;


    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> newset = new HashSet<>();
        for (Integer i : set){
            if (i <= 10) newset.add(i);

        }
        return newset;

    }

    public static void main(String[] args) {

    }
}
