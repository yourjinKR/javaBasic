package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int point = word.length() / 2;
        int now = 0;

        for (int i = 0; i < point; i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                now++;
            }
        }

        System.out.println(point == now ? 1 : 0);
    }
}
