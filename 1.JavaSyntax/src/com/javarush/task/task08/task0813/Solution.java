package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String> ss = new HashSet<String>();
        for(int i=0; i< 20; i++)
        ss.add("Л12" +i );


        return  ss;


    }

    public static void main(String[] args) {

    }
}
