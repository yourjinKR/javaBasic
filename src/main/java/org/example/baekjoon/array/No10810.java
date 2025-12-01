package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

바구니는 N개, 공 번호도 1~N 범위의 숫자.
처음엔 바구니에 공이 없음.
바구니에 공을 1개만 넣을 수 있다? (처음에 잘 이해 못함 이 부분)

도현이는 M번 공을 넣음, 넣을 때는 바구니의 범위를 정하고
정한 바구니에 모두 같은 번호가 적혀 있는 공을 넣음.

공이 있으면 뺀 후 새로 넣는다, 공을 넣을 바구니는 연속적이여야 함.

3 3 0 0 0
3 3 4 4 0
1 1 1 1 0
1 2 1 1 0
 */
public class No10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 바구니는 N개
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bagunis = new int[N];

        // M 만큼 시도
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int iter = Integer.parseInt(st.nextToken());

            // 바구니 범위 정하기
            for (int j = start-1; j <= end-1; j++) {
                // 범위 내 바구니 공 갯수 초기화
                bagunis[j] = 0;
                // 던지는 횟수만큼 공 넣기
                bagunis[j] = iter;
            }
        }

        for (int baguni : bagunis) {
            sb.append(baguni).append(" ");
        }

        // 출력
        System.out.println(sb);
    }
}
