package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {

    }

    public static Solution[] getTwoSolutions() {
        Solution sol1 = new Solution();
        InnerClass in1 = sol1.new InnerClass();
        InnerClass in2 = sol1.new InnerClass();
        sol1.innerClasses[0] = in1;
        sol1.innerClasses[1] = in2;
        Solution sol2 = new Solution();
        InnerClass in3 = sol2.new InnerClass();
        InnerClass in4 = sol2.new InnerClass();
        sol2.innerClasses[0] = in3;
        sol2.innerClasses[1] = in4;
        Solution[] mas= {sol1,sol2};

        return mas;
    }

    public static void main(String[] args) {

    }
}
