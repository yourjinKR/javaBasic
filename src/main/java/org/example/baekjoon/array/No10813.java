package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bagunis = new int[N];

        for (int i = 0; i <N ; i++) {
            bagunis[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int baguni1 = Integer.parseInt(st.nextToken()) - 1;
            int baguni2 = Integer.parseInt(st.nextToken()) - 1;

            int tmp = bagunis[baguni1];
            bagunis[baguni1] = bagunis[baguni2];
            bagunis[baguni2] = tmp;
        }

        StringBuilder sb = new StringBuilder();

        for (int baguni : bagunis) {
            sb.append(baguni).append(" ");
        }

        System.out.println(sb);
    }
}
