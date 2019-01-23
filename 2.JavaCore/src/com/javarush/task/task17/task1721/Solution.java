package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName1 = reader.readLine();
        String FileName2 = reader.readLine();
        reader.close();

        BufferedReader fileInputStream1 = new BufferedReader(new FileReader(FileName1));
        BufferedReader fileInputStream2 = new BufferedReader(new FileReader(FileName2));
        String str ;
        while ((str = fileInputStream1.readLine()) != null){
            allLines.add(str);
         }
        fileInputStream1.close();
      // str=null;
        while ((str = fileInputStream2.readLine()) != null){
            forRemoveLines.add(str);
        }
        fileInputStream2.close();
        /*
        for(String s: allLines)
            System.out.println(s);

        for(String s: forRemoveLines)
            System.out.println(s);
            */
        Solution o = new Solution();
        o.joinData();
    }

    public  void joinData () throws CorruptedDataException {

        List<String> temp = new ArrayList<>();
        temp.addAll(allLines);
        if(allLines.containsAll(forRemoveLines)){
            for(String e : allLines){
                if (forRemoveLines.contains(e)){
                    temp.remove(e);
                }
            }
            allLines.clear();
            allLines.addAll(temp);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
