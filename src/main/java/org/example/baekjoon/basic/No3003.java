package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int UNIT = 6;
        int[] REQUIRE = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < UNIT; i++) {
            int now = Integer.parseInt(st.nextToken());
            sb.append(REQUIRE[i] - now).append(" ");
        }

        System.out.println(sb);
    }
}
