package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<String, Double>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));


        while (reader.ready()){
            String[] info = reader.readLine().split(" ");
            if(map.containsKey(info[0])){
                double d = map.get(info[0]);
                map.remove(info[0]);
                map.put(info[0], d + Double.parseDouble(info[1]));
            }else{
                map.put(info[0], Double.parseDouble(info[1]));
            }
        }
        double max = Collections.max(map.values());

        for(Map.Entry<String,Double> pair : map.entrySet())
        {
            if(max<=(double)pair.getValue())
                System.out.println(pair.getKey());
        }

        reader.close();





    }
}
