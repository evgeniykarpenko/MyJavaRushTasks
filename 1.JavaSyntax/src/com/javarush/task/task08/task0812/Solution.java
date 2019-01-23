package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++) {

            String s = r.readLine();
            int n = Integer.parseInt(s);
            list.add(n);

        }
        int count = 1, Gcount =1 ;

        for(int i=0; i<list.size()-1;i++) {
        if(list.get(i)== list.get(i+1))
        {
            count++;
            if(count>Gcount) Gcount = count;

        }
            else
             count=1;



        }
        System.out.println(Gcount);
      }
}