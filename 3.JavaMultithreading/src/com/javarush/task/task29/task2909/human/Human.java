package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive{
    private List<Human> children = new ArrayList<>();
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;

    @Override
    public void live() {

    }

    protected Size size;




    private BloodGroup bloodGroup;

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPosition()
    {
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition()+": " + name);
    }

    public int getId() {
        return id;
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(this.children);
    }

    public void addChild (Human h)
    {
        this.children.add(h);
    }

    public void removeChild (Human h)
    {
        this.children.remove(h);
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public class Size {
        public int height;
        public int weight;
    }

}