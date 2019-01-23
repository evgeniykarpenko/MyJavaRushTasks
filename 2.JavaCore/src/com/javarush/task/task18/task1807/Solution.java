package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args)throws  Exception {
        int count = 0;
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> ar = new ArrayList<>();
        while(inputStream.available()>0)
        {
            ar.add(inputStream.read());
        }
        inputStream.close();

        for (int i = 0; i < ar.size(); i++) {
          //  System.out.println(ar.get(i));
            if ( ar.get(i)== 44) count ++;

        }
        System.out.println(count);
    }
}
