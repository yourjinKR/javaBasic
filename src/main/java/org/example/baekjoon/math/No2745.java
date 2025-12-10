package org.example.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        System.out.println(convert(N, B));
    }

    public static long convert(String s, int binary) {
        long power = 1;
        long result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int n;

            if ('A' <= c && c <= 'Z') {
                n = c - 'A' + 10;
            }
            else {
                n = c - '0';
            }

            result += n * power;
            power *= binary;
        }

        return result;
    }
}
