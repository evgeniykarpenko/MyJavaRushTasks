package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {

    protected void finalize() throws Throwable
    {
        System.out.println("destroyed");
    }

    //напишите тут ваш код
    public static void main(String[] args) {

    }
}
