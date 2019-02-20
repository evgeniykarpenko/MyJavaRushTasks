package com.javarush.task.task31.task3110;


import javax.sound.midi.Patch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter path1: ");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        ZipFileManager zfm = new ZipFileManager(Paths.get(reader1.readLine()));
        System.out.println("Enter path2: ");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        zfm.createZip(Paths.get(reader2.readLine()));
    }
}
