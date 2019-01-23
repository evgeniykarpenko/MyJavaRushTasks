package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> Children = new ArrayList<>();
        Human human1 = new Human("lol1", true, 22);
        Human human2 = new Human("lol2", true, 22);
        Human human3 = new Human("lol3", true, 22);
        Children.add(human1);
        Children.add(human2);
        Children.add(human3);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        ArrayList<Human> grandFathersChildren1 = new ArrayList<>();
        ArrayList<Human> grandFathersChildren2 = new ArrayList<>();
        Human human4 = new Human("lol4", true, 22,Children);
        Human human5 = new Human("lol5", true, 23,Children);
        grandFathersChildren1.add(human4);
        grandFathersChildren2.add(human5);
        Human human6 = new Human("lol6", true, 23,grandFathersChildren1);
        Human human7 = new Human("lol7", true, 23,grandFathersChildren1);
        Human human8 = new Human("lol8", true, 23,grandFathersChildren2);
        Human human9 = new Human("lol9", true, 23,grandFathersChildren2);


        System.out.println(human4.toString());

        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children;


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
           if (this.children != null){
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
       }
            return text;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex, int age,  ArrayList<Human> child)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = child;

        }
    }

}
