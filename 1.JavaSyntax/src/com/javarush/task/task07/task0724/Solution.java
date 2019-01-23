package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human human1 = new Human("lol1", true, 22);
        Human human2 = new Human("lol2", true, 23);
        Human human3 = new Human("lol3", true, 24);
        Human human4 = new Human("lol4", true, 25);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        Human human5 = new Human("lol5", true, 33, human1, human2);
        Human human6 = new Human("lol6", true, 34, human1, human2);
        Human human7 = new Human("lol7", true, 42, human1, human2);
        Human human8 = new Human("lol8", true, 42, human1, human2);
        Human human9 = new Human("lol9", true, 52, human1, human2);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        Human father, mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }
    }
}






















