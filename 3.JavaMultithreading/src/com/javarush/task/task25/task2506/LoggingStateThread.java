package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread
{
    Thread tr;
    public LoggingStateThread(Thread tr)
    {
        this.tr = tr;

    }

    @Override
    public void run() {

        boolean b = true;
        int i=1;
        State newState, lastSt =null;
            while (b) {
                newState = tr.getState();
               if(newState!=lastSt) {
                   System.out.println(newState);
                   lastSt = newState;

               }
                if(newState== State.TERMINATED)

                    b=false;
            }



        }


}
