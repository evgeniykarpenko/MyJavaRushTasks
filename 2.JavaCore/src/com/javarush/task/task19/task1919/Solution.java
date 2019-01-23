package com.javarush.task.task19.task1919;

/* 
—читаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        reader.close();
     //   System.out.println(map);
        String test = map.toString().replaceAll(",", "");
        test = test.substring(1, test.length() - 1);



        String[] masStr = test.split(" ");
        for (int i = 0; i < masStr.length; i++) {
            System.out.println(masStr[i].split("=")[0] + " " + masStr[i].split("=")[1]);
            //System.out.println();
        }


    }


}




