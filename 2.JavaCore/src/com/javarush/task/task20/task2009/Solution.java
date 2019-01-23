package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "it's test static string";
        public int i;
        public int j;
       private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(staticString);
        }
        private void readObject(ObjectInputStream stream)
                throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            staticString = (String) stream.readObject();
        }
    }

    public static void main(String[] args)  throws  Exception{

        File objectFile = File.createTempFile("objectWhithStaticFild.bin",null);
        //System.out.println(objectFile.getPath()); // путь к созданному временному файлу
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectFile));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objectFile));

        ClassWithStatic first = new ClassWithStatic();
        first.staticString = "22222";
        first.i =500;
        oos.writeObject(first);
        oos.close();

        first.staticString = "33333";
        first.i = 1000;
        ClassWithStatic second = (ClassWithStatic) ois.readObject();
        System.out.println(second.staticString);
        System.out.println(second.i);
        // у Вас будут разные надписи(в зависимости от наличия/отсутствия методов)
        ois.close();
    }
}
