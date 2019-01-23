package com.javarush.task.task25.task2512;

/* 
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {
    public Solution(){
        try {
            throw new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
        } catch (Exception e) {
            uncaughtException(Thread.currentThread(), e);
        }
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {

        try {
           uncaughtException(t,e.getCause());
            System.out.println(e);
        } catch (NullPointerException e1) {
            t.interrupt();
        }

    }

    public static void main(String[] args) {


    Solution solution = new Solution();
    }
}
