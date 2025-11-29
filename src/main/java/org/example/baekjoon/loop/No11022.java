package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력값 받기
        int T = Integer.parseInt(br.readLine());

        // 반복
        for (int i = 1; i <= T; i++) {
            String[] tokens = br.readLine().split(" ");
            int A = Integer.parseInt(tokens[0]);
            int B = Integer.parseInt(tokens[1]);

            sb
                    .append("Case #")
                    .append(i)
                    .append(": ")
                    .append(A)
                    .append(" + ")
                    .append(B)
                    .append(" = ")
                    .append(A + B).append("\n");
        }

        System.out.println(sb);
    }
}
