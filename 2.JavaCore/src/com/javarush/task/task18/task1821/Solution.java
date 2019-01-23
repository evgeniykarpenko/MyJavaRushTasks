package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileNameIn = args[0];
        FileInputStream inputStream =new FileInputStream(fileNameIn);

        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        byte[] buffer = new byte[inputStream.available()];
        while(inputStream.available()>0)
        {
            ar.add(inputStream.read());
        }

        inputStream.close();

        for (int i = 0; i < ar.size(); i++) {

            hm.put(ar.get(i), (Collections.frequency(ar, ar.get(i))));


        }


     //   System.out.println(hm);
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>();
        for (Map.Entry<Integer,Integer> p: hm.entrySet())
        {
            sortedMap.put(p.getKey(),p.getValue());
        }
        for (Map.Entry<Integer,Integer> p: sortedMap.entrySet()
                ) {
                int temp = p.getKey();
                System.out.println( (char)temp + " " + p.getValue());
        }



    }
}
