package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream =new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream inputStream1 =new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream inputStream2 =new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        while(inputStream1.available()>0)
        {


            byte[] buffer1 = new byte[inputStream1.available()];
            inputStream1.read(buffer1);
            outputStream.write(buffer1);


        }

        while(inputStream2.available()>0)
        {
            byte[] buffer2 = new byte[inputStream2.available()];
            inputStream2.read(buffer2);

            outputStream.write(buffer2);



        }

        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
