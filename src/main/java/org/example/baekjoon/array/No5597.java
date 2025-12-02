package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    stream API 최소한 사용하여 구현하도록 연습
 */
public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 상수
        int TOTAL = 30;
        int UNSUBMIT = 2;
        int SUBMIT = TOTAL - UNSUBMIT;

        // 출석수
        boolean[] totalList = new boolean[TOTAL];

        // 낸 사람 체크
        for (int i = 0; i < SUBMIT; i++) {
            int student = Integer.parseInt(br.readLine()) - 1;
            totalList[student] = true;
        }

        // 안 낸 사람 체크
        for (int i = 0; i < TOTAL; i++) {
            if (!totalList[i]) {
                int student = i + 1;
                sb.append(student).append("\n");
            }
        }

        // 출력
        System.out.println(sb);
    }
}
