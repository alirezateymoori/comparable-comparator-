package com.demisco;

public class Student implements Comparable<Student> {
    int age;
    double grade;
    public int compareTo(Student s) {
        return (this.grade<s.grade ? -1:(this.grade==s.grade ? 0 : +1));


    }
    public Student(int age, double grade) {
        this.age = age;
        this.grade = grade;
    }
}
