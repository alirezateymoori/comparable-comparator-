package com.demisco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentComparator comparator = new StudentComparator();
        Student s1 = new Student(21, 17.5);
        Student s2 = new Student(20, 18.5);
        System.out.println(s1.compareTo(s2));
        System.out.println(comparator.compare(s1,s2));


    }
}