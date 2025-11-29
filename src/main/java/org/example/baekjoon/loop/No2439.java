package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2439 {
    static String SYMBOL = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력값 받기
        int N = Integer.parseInt(br.readLine());

        // 반복
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N-i)).append(SYMBOL.repeat(i)).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
