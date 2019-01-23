package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static
    {
        try
        {
            String s;
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            while ((s = reader.readLine())!= null )
                lines.add(s);
        }
        catch (Exception e)
        {

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
