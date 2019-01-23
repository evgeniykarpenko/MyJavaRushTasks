package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String>  map = new HashMap<String,String>();
        map.put("Ник", "Юлия");
        map.put("Саш", "Саша");
        map.put("Миш", "Юлия");
        map.put("Дмит", "Юлия");
        map.put("Юл", "Юлия");
        map.put("Соф", "Софья");
        map.put("Ник111", "Никита");
        map.put("Андр", "Андриана");
        map.put("Лар", "Лариса");
        map.put("Ра", "Раиса");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for(Map.Entry<String,String> pair1 : copy.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair2.getValue().equals(pair1.getValue())) {
                    count++;
                    if (count > 1)
                        removeItemFromMapByValue(map, pair1.getValue());
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
