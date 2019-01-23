package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    static public Hippodrome game;
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private  List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }
    public void run() throws InterruptedException
    {
        for (int i = 1; i<=100; i++)  {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move()
    {
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();
    }
    public void print()
    {
        for (Horse h:horses)
        {
            h.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner()
    {
        Horse w = null;
        double d = 0;
        for (Horse h:horses)
        {
           if(h.distance>d) {d= h.distance; w =h;}
        }
        return w;
    }

    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().name+"!");

    }
    public static void main(String[] args) throws InterruptedException{
        Horse horse1 = new Horse("1",3,0);
        Horse horse2 = new Horse("2",3,0);
        Horse horse3 = new Horse("3",3,0);
        game = new Hippodrome(new ArrayList());
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();

    }
}
