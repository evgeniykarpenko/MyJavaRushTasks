package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    int centerX, centerY, radius, width, color ;

    public Circle(){

    }

    public Circle(int centerX,int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }


    public Circle(int centerX,int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX,int centerY, int radius, int width,int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public Circle(Circle Circle)
    {
        this(5,5,1);


    }
    public static void main(String[] args) {

    }
}