package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String f1 = r.readLine();
        String f2 = r.readLine();
        FileInputStream inputStream1 = new FileInputStream(f1);
        FileOutputStream outputStream = new FileOutputStream(f1);
        FileInputStream inputStream2 = new FileInputStream(f2);
      //  FileInputStream inputStream2 =new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte[] buffer1 = new byte[inputStream1.available()];
        while(inputStream1.available()>0)
        {



            inputStream1.read(buffer1);



        }
        inputStream1.close();


        byte[] buffer2 = new byte[inputStream2.available()];
        while(inputStream2.available()>0)
        {



            inputStream2.read(buffer2);
            outputStream.write(buffer2);


        }
        inputStream2.close();
        outputStream.write(buffer1);
        outputStream.close();

    }
}
