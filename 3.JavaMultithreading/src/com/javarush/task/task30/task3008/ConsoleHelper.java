package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString()
    {
        boolean b = true;
        String s=null;
       while(b) {
           try {
               s = reader.readLine().toString();
               b=false;
           } catch (IOException e) {
               System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
           }
       }
       return s;
    }

    public static int readInt()
    {
        int i=0;
        boolean b = true;
        while(b) {
            try {
                i = Integer.parseInt(readString());
                b=false;
            } catch (NumberFormatException e) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
        return i;
    }
}
