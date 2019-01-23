package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);

        if (a >= c && b < c) { System.out.println(c); }
        else if (a <= c && b > c) { System.out.println(c); }
        else if (a <= b && c < a) { System.out.println(a); }
        else if (a >= b && b > c) { System.out.println(b); }
        else if (a <= b && b < c) { System.out.println(b); }
        else if (a >= b && a < c) { System.out.println(a); }
        else if (b >= c && a < c) { System.out.println(c); }
        else if(b >= c && a > b) { System.out.println(b); }
        else  { System.out.println(a | b | c); }
    }
}
