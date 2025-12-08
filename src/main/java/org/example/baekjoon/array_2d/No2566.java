package org.example.baekjoon.array_2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2566 {
    public static int END = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = 0;
        int y = 0;
        int max = 0;

        for (int i = 0; i < END; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < END; j++) {
                int value = Integer.parseInt(st.nextToken());

                if (max < value) {
                    x = i;
                    y = j;
                    max = value;
                }
            }

        }

        System.out.println(
                sb
                        .append(max).append("\n")
                        .append(x+1).append(" ").append(y+1)
        );
    }
}

