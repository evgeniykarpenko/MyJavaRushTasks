package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ник", 100);
        map.put("Саш", 200);
        map.put("Миш", 300);
        map.put("Дмит", 400);
        map.put("Юл", 500);
        map.put("Соф", 600);
        map.put("Ник111", 700);
        map.put("Андр", 800);
        map.put("Лар", 900);
        map.put("Ра", 900);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Integer>> iter = map.entrySet().iterator();

       while (iter.hasNext())
       {
           HashMap.Entry<String, Integer> pair = iter.next();
           if (pair.getValue() < 500) iter.remove();
       }
    }

    public static void main(String[] args) {



    }
}