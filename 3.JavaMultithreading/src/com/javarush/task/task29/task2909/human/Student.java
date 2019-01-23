package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {

    private double averageGrade;

    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    @Override
    public String getPosition() {
        return "Студент";
    }

    public void live() {
        learn();
    }

    public void learn() {
    }







    public void incAverageGrade(double delta)
    {
        double ag = getAverageGrade();
        setAverageGrade(ag+delta);

    }


    public void setCourse(int course)
    {
        this.course = course;
    }

    public void setAverageGrade(double averageGrade)
    {
        this.averageGrade = averageGrade;
    }

    public int getCourse() {
        return course;
    }
    public void setBeginningOfSession(Date d) {
        beginningOfSession = d;
    }

    public void setEndOfSession(Date d) {
        endOfSession = d;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}