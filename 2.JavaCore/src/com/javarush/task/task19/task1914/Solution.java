package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();


        String result = outputStream.toString();
        System.setOut(console);


        String[] masStr = result.split(" ");
        if ("+".equals(masStr[1]))
            System.out.print(result + "\r" + ((int) Integer.parseInt(masStr[0]) + (int) Integer.parseInt(masStr[2])));

        if ("*".equals(masStr[1]))
            System.out.print(result + ((int) Integer.parseInt(masStr[0]) * (int) Integer.parseInt(masStr[2])));

        if ("-".equals(masStr[1]))
            System.out.print(result + ((int) Integer.parseInt(masStr[0]) - (int) Integer.parseInt(masStr[2])));


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

