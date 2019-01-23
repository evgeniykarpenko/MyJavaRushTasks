package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println(new Solution(4));
        Solution savedObject = new Solution(114);
        Solution loadedObject = null;
        File file = new File("b:\\1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(savedObject);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        loadedObject = (Solution)objectInputStream.readObject();
        System.out.println((loadedObject.toString()).equals(savedObject.toString()));
    }

   transient private final String pattern = "dd MMMM yyyy, EEEE";
     private transient Date  currentDate;
   transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
