package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
������� � ���������
*/

public class Solution {
    public static char[] vowels = new char[]{'�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};

    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
        ArrayList vowels = new ArrayList<>();
        ArrayList notVowels = new ArrayList();
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String s = reader.readLine();
        char[] charArray = s.toCharArray();
        for(int i=0; i< charArray.length; i++)
        {
            if (isVowel(charArray[i])) {vowels.add(charArray[i]);vowels.add(" ");}
            else { if(charArray[i]!=' '){
                notVowels.add(charArray[i]); notVowels.add(" ");}}
        }
        for(int i= 0; i<vowels.size();i++)
            System.out.print(vowels.get(i));
        System.out.println();
        for(int i= 0; i<notVowels.size();i++)
            System.out.print(notVowels.get(i));
    }


    // ����� ���������, ������� �� �����
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // �������� ������ � ������ ������� - �� ��������� � �������� ������

        for (char d : vowels)   // ���� ����� ������� �������
        {
            if (c == d)
                return true;
        }
        return false;
    }
}