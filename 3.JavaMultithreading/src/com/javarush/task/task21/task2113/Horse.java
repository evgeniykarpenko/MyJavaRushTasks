package com.javarush.task.task21.task2113;

public class Horse {
    String name;
    double speed;
    double distance;



    public Horse(String name, double speed, double distance) {
        this.name = name;

        this.speed = speed;
        this.distance = distance;
    }
    public void move()
    {
        this.distance += (this.speed * Math.random());
    }
    public void print()
    {
        int top  = (int) this.distance;
        for (int i = 0; i < top; i++) {
            System.out.print(".");
        }
        System.out.println(this.name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}