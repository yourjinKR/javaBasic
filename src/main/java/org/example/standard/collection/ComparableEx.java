package org.example.standard.collection;

import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(3);

        List<Student> school = new java.util.ArrayList<>(List.of(s2, s1, s3));
        Collections.sort(school);
        System.out.println(school);
    }
}

class Student implements Comparable<Student> {
    Integer grade;

    public Student(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return grade.compareTo(o.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}