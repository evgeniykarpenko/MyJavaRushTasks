package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private boolean sex;
        private String name;
        private boolean evrei;
        private  int rost;
        private double ves;

        public Human()
        {}

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
            this.age = 0;
           this.evrei = false;
            this.rost = 2;
            this.ves = 100;
        }

        public Human(String name, double ves, int rost)
        {
            this.name = name;
            this.ves = ves;
            this.rost = rost;
        }

        public Human(String name, boolean evrei, double ves, int rost)
        {
            this.name = name;
            this.evrei = evrei;
            this.ves = ves;
            this.rost = rost;
        }

        public Human(String name, double ves, int rost, boolean sex)
        {
            this.name = name;
            this.sex = sex;
            this.ves = ves;
            this.rost = rost;
        }

        public Human(String name, double ves, int rost, boolean sex, boolean evrei)
        {
            this.name = name;
            this.sex = sex;
            this.ves = ves;
            this.rost = rost;
            this.evrei = evrei;
        }

        public Human(String name, double ves, int rost, boolean sex, boolean evrei, int age)
        {
            this.name = name;
            this.sex = sex;
            this.ves = ves;
            this.rost = rost;
            this.evrei = evrei;
            this.age = age;
        }

        public Human(String name, boolean evrei, double ves, int rost, int age)
        {
            this.name = name;
            this.evrei = evrei;
            this.ves = ves;
            this.rost = rost;
            this.age = age;
        }

        public Human(String name, double ves, int rost, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.ves = ves;
            this.rost = rost;
            this.age = age;
        }
        public Human(String name, boolean evrei, int rost )
        {
            this.name = name;
            this.evrei = evrei;
            this.age = 0;
            this.evrei = false;
            this.rost = rost;
            this.ves = 100;
        }
    }


}
