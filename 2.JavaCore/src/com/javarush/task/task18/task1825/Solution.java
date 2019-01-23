package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution  {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String,byte[]> tr = new TreeMap();
        String fileName = reader.readLine();


        int firstindex = fileName.indexOf(".part");
        String resultName = new String(fileName.substring(0,firstindex));
        FileOutputStream outputStream =new FileOutputStream(resultName);
        while(!"end".equals(fileName))
        {


            FileInputStream inputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[inputStream.available()];

            int lasttindex = fileName.length();
            String str = new String(fileName.substring(firstindex,lasttindex));
            System.out.println(str);
            inputStream.read(buffer);

            tr.put(str,buffer);

            fileName = reader.readLine();
                inputStream.close();
        }


        System.out.println(resultName);
        System.out.println(tr);

        for (  Map.Entry<String, byte[]> temp : tr.entrySet()         ) {

            outputStream.write(temp.getValue());

        }
        outputStream.close();
    }
}
