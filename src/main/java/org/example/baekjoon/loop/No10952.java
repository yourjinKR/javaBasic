package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 반복 받기
        while (true) {
            String[] tokens = br.readLine().split(" ");

            int A = Integer.parseInt(tokens[0]);
            int B = Integer.parseInt(tokens[1]);

            // 반복 계산 및 00일때 종료
            if (A == 0 && B == 0) {
                break;
            } else {
                sb.append(A + B).append("\n");
            }
        }

        // 출력
        System.out.println(sb);
    }
}
