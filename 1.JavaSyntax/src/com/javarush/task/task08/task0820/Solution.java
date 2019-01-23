package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for(int i = 0 ; i<4; i++)
            result.add(new Cat());
        return result;
        //напишите тут ваш код


    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        for(int i = 0 ; i<3; i++)
            result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> result = new HashSet<Object>();
        for(Object obj : cats)
            result.add(obj);
        for(Object obj : dogs)
            result.add(obj);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for(Object obj : cats)
            pets.remove(obj);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object obj : pets)
            System.out.println(obj);
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
