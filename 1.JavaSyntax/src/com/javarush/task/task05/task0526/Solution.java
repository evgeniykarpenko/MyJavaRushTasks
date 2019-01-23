package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

import java.lang.management.ManagementFactory;

public class Solution{
    public static class Man{
        int age;
        String name;
        String address;

        public Man( String name ,int age, String address)
        {
            this.name=name;
            this.age = age;
            this.address=address;
        }
    }
    public static class Woman{
        int age;
        String name;
        String address;

        public Woman( String name ,int age, String address)
        {
            this.name=name;
            this.age = age;
            this.address=address;
        }
    }
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("m1",1,"m1ad");
        Man man2 = new Man("m2",2,"m2ad");
        Woman w1 = new Woman("w1",1,"w1ad");
        Woman w2 = new Woman("w2",2,"w2ad");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(w1.name + " " + w1.age + " " + w1.address);
        System.out.println(w2.name + " " + w2.age + " " + w2.address);
    }

    //напишите тут ваш код
}
