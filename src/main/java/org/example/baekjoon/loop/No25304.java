package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 예상 총 금액 X
        long X = Long.parseLong(br.readLine());

        // 총 물건 수 N
        int N = Integer.parseInt(br.readLine());

        // 실 금액 result
        long result = 0;

        for (int i = 0; i < N; i++) {
            // 각 줄에 물건 가격 a와 개수 b가 있음
            String[] token = br.readLine().split(" ");
            long a = Long.parseLong(token[0]);
            long b = Long.parseLong(token[1]);

            result += a * b;
        }

        System.out.println(X == result ? "Yes" : "No");
    }
}
