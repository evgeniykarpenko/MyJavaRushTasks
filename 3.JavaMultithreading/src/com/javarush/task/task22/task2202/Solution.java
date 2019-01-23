package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие"));
    }

    public static String getPartOfString(String string) {

           if (string == null || string.isEmpty()) throw new TooShortStringException();
            String[] strArr = string.split(" ");
            if (strArr.length < 5) throw new TooShortStringException();
            return String.format("%s %s %s %s", strArr[1], strArr[2], strArr[3], strArr[4]);


    }

    public static class TooShortStringException extends RuntimeException {

        public TooShortStringException() {

        }

        public TooShortStringException(String message) {
            super(message);
        }
    }
}
