package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
        String s = sb.toString();
        String result =  s.replace('.', '!');



        bdWriter.write(result);

        bReader.close();
        bdWriter.close();
    }
}
