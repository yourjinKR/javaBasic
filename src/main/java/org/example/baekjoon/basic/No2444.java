package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

망할 공백도 따져야 하는 문제였음
모양에 집중한 나머지 문제의 본질을 파악 못함

 */
public class No2444 {
    public static String SYMBOL = "*";
    public static String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int ROW = N * 2 - 1;
        int[] arr = new int[ROW];

        for (int i = 0; i < ROW; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            int gap = Math.abs(arr[i] - N);

            sb
                    .append(BLANK.repeat(gap))
                    .append(SYMBOL.repeat(ROW - gap * 2))
                    .append(" \n");
        }

        System.out.println(sb);
    }
}
