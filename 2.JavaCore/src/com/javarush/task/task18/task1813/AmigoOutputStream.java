package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fo;

    public AmigoOutputStream(FileOutputStream fo) throws FileNotFoundException {
        super(fileName);
        this.fo = fo;
    }



    @Override
    public void write(int b) throws IOException {
        fo.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fo.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        fo.flush();
        write("JavaRush © All rights reserved.".getBytes());
        fo.close();
    }

    @Override
    public void flush() throws IOException {
        fo.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
