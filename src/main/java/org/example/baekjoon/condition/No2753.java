package org.example.baekjoon.condition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2753 {
    public static void main(String[] args) throws IOException {
        // 윤년
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        boolean c1 = year % 4 == 0 && year % 100 != 0;
        boolean c2 =  year % 400 == 0;

        if (c1 || c2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
