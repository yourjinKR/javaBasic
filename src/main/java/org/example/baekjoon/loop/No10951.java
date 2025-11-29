package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 반복 받기
        while (true) {
            try {
                String input = br.readLine();

                String[] tokens = input.split(" ");

                int A = Integer.parseInt(tokens[0]);
                int B = Integer.parseInt(tokens[1]);

                sb.append(A + B).append("\n");
            } catch (Exception e) {
                break;
            }
        }

        // 출력
        System.out.println(sb);
    }
}
