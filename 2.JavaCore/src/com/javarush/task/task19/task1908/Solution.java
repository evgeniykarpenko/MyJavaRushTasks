package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();


        BufferedReader bReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bdWriter = new BufferedWriter(new FileWriter(fileName2));
        StringBuilder sb = new StringBuilder();
        while(bReader.ready())
        {
            sb.append((char)bReader.read());
        }
            String[] masStr = sb.toString().split(" ");

        for (int i = 0; i < masStr.length; i++) {
            try
            {
                Integer.parseInt(masStr[i]);
                bdWriter.write(masStr[i] + " ");
            }
            catch (NumberFormatException e)
            {

            }

        }
        bReader.close();
        bdWriter.close();
    }
}
