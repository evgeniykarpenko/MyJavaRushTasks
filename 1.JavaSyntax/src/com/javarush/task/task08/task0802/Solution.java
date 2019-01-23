package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> HM = new HashMap();
        HM.put("арбуз","ягода");
        HM.put("банан","трава");
        HM.put("вишня","ягода");
        HM.put("груша","фрукт");
        HM.put("дыня","овощ");
        HM.put("ежевика","куст");
        HM.put("жень-шень","корень");
        HM.put("земляника","ягода");
        HM.put("ирис","цветок");
        HM.put("картофель","клубень");
        for(Map.Entry<String, String> pair : HM.entrySet())
        {
        String key = pair.getKey();
        String value = pair.getValue();
        System.out.println(key+" - "+value);
    }
}
}
