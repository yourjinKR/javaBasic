package org.example.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 같은 눈이 있는지 확인, 같은 눈의 숫자가 무엇인지 확인, 상금 계산
public class No2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int score = 0;
        int match = Math.max(Math.max(A, B), C);

        if (A == B) {
            match = A;
            if (B == C) {
                score = 3; // 다 같음
            } else {
                score = 2; // A == B
            }
        } else {
            if (B == C) {
                score = 2; // B == C
                match = C;
            } else if (A == C) {
                score = 2; // A == C
                match = C;
            }
        }

        if (score == 3) {
            System.out.println(10_000 + match * 1000);
        }
        if (score == 2) {
            System.out.println(1_000 + match * 100);
        }
        if (score == 0) {
            System.out.println(100 * match);
        }
    }
}
