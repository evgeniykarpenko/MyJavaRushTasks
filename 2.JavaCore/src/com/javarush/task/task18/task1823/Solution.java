package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while(!"exit".equals(fileName))
        {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
            fileName = reader.readLine();
        }

    }

    public static class ReadThread extends Thread {


        private String fileName = null;
        ArrayList<Integer> list = new ArrayList<>();
        public ReadThread(String fileName) throws IOException
        {
            //implement constructor body
            this.fileName = fileName;
            FileInputStream inputStream = new FileInputStream(fileName);
            while (inputStream.available() > 0)
                list.add(inputStream.read());
            inputStream.close();
        }


        public void run()
        {
           int elem = list.get(0);
           for (int x : list)
               if(Collections.frequency(list,x) > Collections.frequency(list,elem)) elem  = x;
           resultMap.put(fileName,elem);



        }
    }
}
