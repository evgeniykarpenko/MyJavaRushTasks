package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
   int left, top, width, height;

    public void initialize( int left, int top,int  width,int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize( int left, int top)
    {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height =0;
    }

    public void initialize( int left, int top,int  width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle Rectangle) {
        this.top = Rectangle.top;
        this.left = Rectangle.left;
        this.width = Rectangle.width;
        this.height = Rectangle.height;
    }

    public static void main(String[] args) {

    }
}
