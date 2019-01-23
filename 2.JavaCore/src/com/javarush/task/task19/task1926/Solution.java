package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));



        while (fileReader.ready()) {
            String s = fileReader.readLine();

            StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(s);
            System.out.println(stringBuilder.reverse());
                }


        fileReader.close();
        reader.close();
        }




}
