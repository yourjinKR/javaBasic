package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("int");

        // 입력값
        int N = Integer.parseInt(br.readLine());

        // 배수만큼 long 붙이기
        for (int i = 0; i < N/4; i++) {
            sb.insert(0, "long ");
        }

        // 출력
        System.out.println(sb);
    }
}
