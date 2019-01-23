package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {




    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here

        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        else
            median = (double) array[array.length/2];

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs((int)median-o1)-Math.abs((int)median-o2);
            }
        };
        Arrays.sort(array,comparator);

        return array;
    }
}
