package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> hashset  = new HashSet();
        hashset.add("арбуз");
        hashset.add("банан");
        hashset.add("вишня");
        hashset.add("груша");
        hashset.add("дыня");
        hashset.add("ежевика");
        hashset.add("жень-шень");
        hashset.add("земляника");
        hashset.add("ирис");
        hashset.add("картофель");

        for (String text : hashset )
        {
            System.out.println(text);
        }

    }
}
