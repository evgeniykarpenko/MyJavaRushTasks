package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
    for(Thread th : threads)
    {
        switch (th.getState().toString())
        {
            case("NEW") :
                th.start();
                break;
            case "WAITING":
            case "TIMED_WAITING":
            case "BLOCKED":
                th.interrupt();
                break;
            case("RUNNABLE") :
                th.isInterrupted();
                break;
            case("TERMINATED") :
                System.out.println(th.getPriority());
                break;
        }
    }

    }

    public static void main(String[] args) throws InterruptedException{
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        Thread th3 = new Thread();

       processThreads(th1,th2,th3);
    }
}
