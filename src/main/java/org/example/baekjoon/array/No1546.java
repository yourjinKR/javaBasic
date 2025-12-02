package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목 수
        int N = Integer.parseInt(br.readLine());
        // 성적 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> scoreList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }

        Double max = Double.valueOf(Collections.max(scoreList));

        double average = scoreList.stream()
                .map(integer -> integer / max)
                .mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println(average * 100);
    }
}
