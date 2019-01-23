package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ar = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0) {

            ar.add(inputStream.read());
        }
        inputStream.close();


        for (int i = 0; i < ar.size(); i++) {


            hs.add(ar.get(i));

        }

        List sortedList = new ArrayList(hs);
        Collections.sort(sortedList);
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.print(sortedList.get(i)+" ");
        }


    }
}