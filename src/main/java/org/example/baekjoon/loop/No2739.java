package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2739 {
    public static void main(String[] args) throws IOException {
        // 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 반복
        for (int i = 1; i <= 9; i++) {
            sb
                    .append(number)
                    .append(" * ")
                    .append(i)
                    .append(" = ")
                    .append(number*i)
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
