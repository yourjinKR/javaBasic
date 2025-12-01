package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 정답에서 index인지 몇번째 수인지 주의하자
public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = 9;
        List<Integer> numList = new ArrayList<>();

        // 정수 9개 받기
        for (int i = 0; i < N; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        int MAX = Collections.max(numList);
        int INDEX = numList.indexOf(MAX);

        System.out.println(sb.append(MAX).append("\n").append(INDEX + 1));
    }
}
