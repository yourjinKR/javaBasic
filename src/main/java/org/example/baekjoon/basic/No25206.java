package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 20;

        Student student = new Student();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            double totalPoint = Double.parseDouble(st.nextToken());
            String gradePoint = st.nextToken();

            if (!gradePoint.equals("P")) {
                Lecture lecture = new Lecture(name, totalPoint, gradePoint);
                student.addLecture(lecture);
            }
        }

        System.out.println(student.getMyAverage());
    }
}

class Student {
    private final List<Lecture> lectures;

    public Student() {
        this.lectures = new ArrayList<>();
    }

    public void addLecture(Lecture lecture) {
        this.lectures.add(lecture);
    }

    public double getMyAverage() {

        double sumOfTotalPoint = this.lectures.stream()
                .map(Lecture::getTotalPoint)
                .mapToDouble(Double::doubleValue)
                .sum();

        double sumOfPoint = this.lectures.stream()
                .map(Lecture::getPoint)
                .mapToDouble(Double::doubleValue)
                .sum();

        return sumOfPoint / sumOfTotalPoint;
    }
}

class Lecture {
    public String name;
    public double totalPoint;
    public double gradePoint;

    public Lecture(String name, double totalPoint, String gradePoint) {
        this.name = name;
        this.totalPoint = totalPoint;
        this.gradePoint = calcGradePoint(gradePoint);
    }

    private double calcGradePoint(String gradePoint) {
        switch (gradePoint) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0;
        }
    }

    public double getTotalPoint() {
        return this.totalPoint;
    }

    public double getPoint() {
        return totalPoint * gradePoint;
    }
}