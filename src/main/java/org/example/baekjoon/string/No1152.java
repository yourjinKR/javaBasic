package org.example.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");
        int count = 0;

        for (String token : tokens) {
            if (!token.isBlank()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
