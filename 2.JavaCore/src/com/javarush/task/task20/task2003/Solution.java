package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public  static  Map prop = new Properties();

    public void fillInPropertiesMap() throws Exception{
        //implement this method - реализуйте этот метод
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        load(fileInputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        for (Map.Entry<String,String> pair: properties.entrySet()
                ) {
            prop.setProperty(pair.getKey(),pair.getValue());
        }
        prop.save(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.load(inputStream);
        properties.putAll((Map)prop);

    }

    public static void main(String[] args) throws IOException{


    }
}
