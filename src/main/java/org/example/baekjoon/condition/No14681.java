package org.example.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        x = x > 0 ? 1 : -1;
        y = y > 0 ? 1 : -1;

        if (x == 1) {
            if (y == 1) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        }

        if (x == -1) {
            if (y == -1) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
    }
}
