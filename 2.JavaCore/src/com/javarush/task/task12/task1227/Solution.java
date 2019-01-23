package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements  Fly, Swim, Run{
        public void run()
        {}
        public void swim()
        {}
        public void fly()
        {}

    }

    public class Penguin implements Swim, Run{
        public void run()
        {}
        public void swim()
        {}

    }

    public class Toad implements Swim {

        public void swim()
        {}

    }
}
