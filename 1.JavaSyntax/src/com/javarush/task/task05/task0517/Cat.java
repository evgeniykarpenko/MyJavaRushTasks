package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;
    public Cat(String name) {
        this.name=name;
        this.age=9;
        this.weight=7;
        this.color="Красный";
    }
    public Cat(String name, int weight, int age) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="Красный";
    }
    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
        this.weight=6;
        this.color="Рыжый";
    }
    public Cat(int weight, String color) {
        this.age=5;
        this.weight=weight;
        this.color=color;
    }
    public Cat(int weight, String color, String address) {
        this.age=6;
        this.weight=weight;
        this.address=address;
        this.color=color;
    }
    public static void main(String[] args) {

    }
}
