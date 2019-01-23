package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> listNa3 = new ArrayList();
        ArrayList<Integer> listNa2 = new ArrayList();

        ArrayList<Integer> listOther = new ArrayList();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<20;i++) {

            String s = r.readLine();
            int n = Integer.parseInt(s);
            list.add(n);

            if(n%3==0) listNa3.add(list.get(i));
            if(n%2==0) listNa2.add(list.get(i));
            if((n%2!=0)&&(n%3!=0))  listOther.add(list.get(i));


        }
        r.close();
       /* for(int i=0; i<20;i++) {


            if(list.get(i)%3==0) listNa3.add(list.get(i));
            if(list.get(i)%2==0) listNa2.add(list.get(i));
            if((list.get(i)%2!=0)&&(list.get(i)%3!=0))  listOther.add(list.get(i));


        }*/

        printList(listNa2);
        printList(listNa3);
        printList(listOther);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(int i=0; i<list.size();i++) {
            System.out.println(list.get(i));

        }
    }
}
