package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread ob1 = new SpecialThread();
        Thread thread1 = new Thread(ob1);
        SpecialThread ob2 = new SpecialThread();
        Thread thread2 = new Thread(ob2);
        SpecialThread ob3 = new SpecialThread();
        Thread thread3 = new Thread(ob3);
        SpecialThread ob4 = new SpecialThread();
        Thread thread4 = new Thread(ob4);
        SpecialThread ob5 = new SpecialThread();
        Thread thread5 = new Thread(ob5);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
