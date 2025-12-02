package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bagunis = new int[N];

        for (int i = 0; i < N; i++) {
            bagunis[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            List<Integer> target = new ArrayList<>();

            for (int j = end; j >= start; j--) {
                target.add(bagunis[j]);
            }

            for (int j = start; j <= end; j++) {
                bagunis[j] = target.get(0);
                target.remove(0);
            }
        }

        for (int baguni : bagunis) {
            sb.append(baguni).append(" ");
        }

        System.out.println(sb);
    }
}

/*
역순 정렬 로직은 while문을 통해서도 아래와 같이 구현 가능하다.
결국 여러 수도 역정렬 하는 것도 두 수를 바꾸는 것과 크게 다르지 않음.
 */
class No10811_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 N과 M을 읽기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] baskets = new int[N + 1];
        for (int k = 1; k <= N; k++) {
            baskets[k] = k;
        }
        for (int m = 0; m < M; m++) {
            // M개의 줄에서 i와 j를 읽기
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken()); // 시작 바구니 번호
            int j = Integer.parseInt(st.nextToken()); // 끝 바구니 번호

            // i번째부터 j번째 바구니까지 순서를 역순으로 변경
            while (i < j) {
                // 두 위치의 값을 임시 변수(temp)를 이용해 교환(swap)
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 1; k <= N; k++) {
            sb.append(baskets[k]).append(" ");
        }
        // 마지막 공백 제거 및 출력
        System.out.println(sb.toString().trim());
    }
}