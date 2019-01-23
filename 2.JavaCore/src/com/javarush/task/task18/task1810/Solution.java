package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        while (true) {
            try {
                FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

                if(inputStream.available() < 1000) {
                    inputStream.close();
                    throw new DownloadException();
                }



            } catch (IOException e) {
                //e.getStackTrace();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}

