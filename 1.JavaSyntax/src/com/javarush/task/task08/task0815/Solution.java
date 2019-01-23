package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String>  map = new HashMap<String,String>();
        map.put("Ник", "Никита");
        map.put("Саш", "Саша");
        map.put("Миш", "Миша");
        map.put("Дмит", "Дмитрий");
        map.put("Юл", "Юлия");
        map.put("Соф", "Софья");
        map.put("Ник111", "Никита");
        map.put("Андр", "Андриана");
        map.put("Лар", "Лариса");
        map.put("Ра", "Раиса");

        return map;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String text = pair.getValue();
            if (name.equals(text)) count++;
        }
return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String text = pair.getKey();
            if (lastName.equals(text)) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
