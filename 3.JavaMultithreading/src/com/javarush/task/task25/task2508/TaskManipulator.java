package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable,  CustomThreadManipulator {
    public String str;
    Thread tr;

    @Override

    public void start(String threadName) {
        tr = new Thread(this,threadName);
        tr.start();
    }

    @Override
    public void stop() {
      tr.interrupt();

    }

    @Override
    public void run()  {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e)
        {
               Thread.currentThread().interrupt();
        }
    }
}
