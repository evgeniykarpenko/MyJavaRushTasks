package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        int z = 0;
        for (int i = 0; i < 40; i++) {
            for (int r = z; r < s.length(); r++) {
                System.out.print(s.charAt(r));
            }
            z++;
            System.out.println();
        }
    }

}

