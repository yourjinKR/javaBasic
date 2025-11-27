package org.example.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        m -= 45;

        if(m < 0) {
            h--;
            m = 60 - Math.abs(m); // m + 15로도 바꾸기 가능
        }

        if (h < 0) { h = 23; }

        System.out.printf("%d %d%n", h, m);
    }

    /*

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        m -= 45;

        if (m < 0) {
            h -= 1;
            m = 60 - Math.abs(m);
        }

        if (h < 0) {
            h = 24 - Math.abs(h);
        }

        System.out.printf("%d %d%n", h, m);
    }


 */
}

