package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<10;i++) {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String s = r.readLine();
            list.add(s);

        }
        int Numk=0, Numd=0;



        int MinStr = list.get(0).length();

        for(int i=0; i<list.size();i++) {
            if(MinStr > (list.get(i)).length()) {
                MinStr =list.get(i).length();
      //          System.out.println(MinStr);
                Numk = i;
      //          System.out.println(Numk);

            }
        }


        int MaxStr = list.get(0).length();
        for(int i=0; i<list.size();i++) {
            if((list.get(i)).length() > MaxStr){
                MaxStr = list.get(i).length();
      //          System.out.println(MaxStr);
                Numd = i;
     //           System.out.println(Numd);

            }
        }
    if(Numd<Numk)
        System.out.println(list.get(Numd));
        else System.out.println(list.get(Numk));
    }
}
