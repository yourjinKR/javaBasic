package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] token = br.readLine().split(" ");
            int A = Integer.parseInt(token[0]);
            int B = Integer.parseInt(token[1]);

            sb.append(A + B).append("\n");
        }

        System.out.println(sb);
    }
}
