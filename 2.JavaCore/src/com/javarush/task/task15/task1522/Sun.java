package com.javarush.task.task15.task1522;

/**
 * Created by IzIFRag on 23.08.2017.
 */
public class Sun implements Planet {

    private static Sun instance;
    private Sun(){}

    public static Sun getInstance(){
        if(instance == null)
        {
            instance = new Sun();
        }
        return instance;
    }
}


