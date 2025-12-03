package org.example.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);

            sb.append(start).append(end).append("\n");
        }

        System.out.println(sb);
    }
}
