package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String,String>  map = new HashMap<String,String>();
        map.put("Ник", "Юлия");
        map.put("Саш", "Саша");
        map.put("Миш", "Юлия");
        map.put("Дмит", "Юлия");
        map.put("Юл", "Юлия");
        map.put("Соф", "Софья");
        map.put("Миш", "Никита");
        map.put("Андр", "Андриана");
        map.put("Миш", "Лариса");
        map.put("Ра", "Раиса");

        return map;


    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
