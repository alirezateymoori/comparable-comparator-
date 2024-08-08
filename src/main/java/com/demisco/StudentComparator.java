package com.demisco;


import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age<s2.age? -1:(s1.age==s2.age?0 : +1);
    }
}