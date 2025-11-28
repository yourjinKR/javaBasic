package org.example.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

//    public static void main(String[] args) throws IOException {
//        // 입력값
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        // 시도 횟수 받기
//        int t = Integer.parseInt(br.readLine());
//
//        // 시도 횟수만큼 반복
//        for (int i = 0; i < t; i++) {
//            String[] numbers = br.readLine().split(" ");
//            int num1 = Integer.parseInt(numbers[0]);
//            int num2 = Integer.parseInt(numbers[1]);
//
//            sb.append(num1 + num2).append("\n");
//        }
//
//        // 출력
//        System.out.println(sb);
//    }
}

/*
입력값 형식 다시 한번 더 확인하기
 */