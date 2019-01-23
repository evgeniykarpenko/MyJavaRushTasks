package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum1 = 0, sum2 = 0,sum3 = 0, sum =0;
        sum1 = (number - number%100)/100;
        sum2 =((number%100) -( (number%100)%10))/10;
        sum3 = (number%100)%10;
        sum = sum1+sum2+sum3;
        return sum;

    }
}