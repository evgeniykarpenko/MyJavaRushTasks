package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 18 1989"));
        map.put("Stallone2", new Date("JUNE 19 1988"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 10 1980"));
        map.put("Stallone5", new Date("MAY 13 1980"));
        map.put("Stallone6", new Date("JUNE 14 1933"));
        map.put("Stallone7", new Date("MAY 12 1953"));
        map.put("Stallone8", new Date("JUNE 12 1989"));
        map.put("Stallone9", new Date("MAY 15 1933"));
        map.put("Stallone0", new Date("MAY 11 1910"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
          ArrayList <String> rem = new ArrayList<>();
        for(Map.Entry<String, Date> pair : map.entrySet())
        {
            Date date = pair.getValue();
            if( date.getMonth()>=5 && date.getMonth()<=7)
                rem.add(pair.getKey());
        }
        for (String key: rem){
            map.remove(key);
        }

    }

    public static void main(String[] args) {

    }
}
