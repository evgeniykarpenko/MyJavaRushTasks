package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {132,133};
        int[] ar3 = {6,7,8,9};
        int[] ar4 = {11,22,33,44,55,66,77};
        int[] ar5 = {};
        ArrayList<int[]> arlist = new ArrayList<int[]>();
        arlist.add(ar1);
        arlist.add(ar2);
        arlist.add(ar3);
        arlist.add(ar4);
        arlist.add(ar5);
        return arlist;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
