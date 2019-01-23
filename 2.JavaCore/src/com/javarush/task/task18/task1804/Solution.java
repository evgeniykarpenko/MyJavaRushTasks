package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0) {

            ar.add(inputStream.read());
        }
        inputStream.close();


        for (int i = 0; i < ar.size(); i++) {

            hm.put(ar.get(i), (Collections.frequency(ar, ar.get(i))));


        }

      //  System.out.println(hm.toString());
        int min = Collections.min(hm.values());
   //       System.out.println(min);
        for (Map.Entry<Integer,Integer> p: hm.entrySet()
                ) {
            if(p.getValue() == min)
                System.out.print(p.getKey() + " ");
        }

    }
}