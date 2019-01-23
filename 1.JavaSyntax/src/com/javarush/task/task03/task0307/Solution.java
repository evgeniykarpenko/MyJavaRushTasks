package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zerg = new Zerg[10];
        for (int i=0;i<10;i++)
        {
            zerg[i]=new Zerg();
           zerg[i].name="Zerg#"+i;
        }

        Terran[] trn = new Terran[12];
        for (int i=0;i<12;i++)
        {
            trn[i]=new Terran();
            trn[i].name="Terran#"+i;
        }

        Protoss[] prts = new Protoss[5];
        for (int i=0;i<5;i++)
        {
            prts[i]=new Protoss();
            prts[i].name="Protoss#"+i;
        }
    }


    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
