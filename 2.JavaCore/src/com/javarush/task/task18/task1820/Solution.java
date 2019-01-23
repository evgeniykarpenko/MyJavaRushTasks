package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String f1 = r.readLine();
        String f2 = r.readLine();
        FileInputStream inputStream = new FileInputStream(f1);
        FileOutputStream outputStream = new FileOutputStream(f2);
        ArrayList list = new ArrayList();
        byte[] buffer = new byte[inputStream.available()];

        while(inputStream.available()>0)
        {
            inputStream.read(buffer);
        }
        inputStream.close();
        String str = new String(buffer);
        String[] masstr = str.split(" ");
        for (int i = 0; i < masstr.length; i++) {
            double a = Double.parseDouble(masstr[i]);
            if(a>=0) {
                if (a - (int) a >= 0.5) list.add((int) a + 1);
                else list.add((int) a);
            }
            else {
                if (a - (int)a <-0.5) list.add((int) a - 1);
                else list.add((int) a);
            }
        }
        String ready = (list.toString().substring(1,list.toString().length()-1)).replace(",", "");
        byte[] arrByteFinal = ready.getBytes();

        for (int i = 0; i < arrByteFinal.length; i++) {
           outputStream.write(arrByteFinal[i]);
        }
        outputStream.close();
    }
}
