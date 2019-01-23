package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList();
    protected int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University(String name, int age) {

    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:

        Student st = null;
        for (Student s:students) {
            if(s.getAverageGrade()==averageGrade)
                st=s;
        }
        return st;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student st = null;
        double maxAverageGrade =0;
        for (Student s:students) {
            if(s.getAverageGrade()>maxAverageGrade) {
                maxAverageGrade=s.getAverageGrade();
                st = s;
            }
        }
        return st;
    }

    public Student  getStudentWithMinAverageGrade() {
        //TODO:
        Student st = null;
        double minAverageGrade =1000;
        for (Student s:students) {
            if(s.getAverageGrade()<minAverageGrade) {
                minAverageGrade=s.getAverageGrade();
                st = s;
            }
        }
        return st;
    }

    public void expel(Student student)
    {
        students.remove(student);
    }
}