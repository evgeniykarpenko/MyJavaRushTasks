package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileInName = reader.readLine();
        String fileOutName = reader.readLine();
        reader.close();int i=0;
        FileReader fileReader = new FileReader(fileInName);
        FileWriter fileWriter = new FileWriter(fileOutName);
        while (fileReader.ready()) {

            int data = fileReader.read();
            if((i>=1)&&(i%2!=0))
            fileWriter.write(data);
            i++;

        }




        fileReader.close();
        fileWriter.close();

    }
}
