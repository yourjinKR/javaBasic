package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*

BufferedWriter도 한번씩 사용해볼까?

 */
public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수열 갯수 입력
        Integer N = Integer.parseInt(st.nextToken());

        // 비굣값 입력
        Integer X = Integer.parseInt(st.nextToken());

        // 수열 입력
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int token = Integer.parseInt(st.nextToken());

            if (token < X) {
                bw.write(token + " ");
            }
        }

        bw.flush();
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] nx = br.readLine().split(" ");
//
//        // 수열 갯수 입력
//        Integer N = Integer.parseInt(nx[0]);
//
//        // 비굣값 입력
//        Integer X = Integer.parseInt(nx[1]);
//
//        // 수열 입력
//        List<Integer> tokens = Arrays.stream(br.readLine().split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toUnmodifiableList());
//
//        // 비교
//        List<String> filteredTokens = tokens.stream()
//                .filter(integer -> integer < X)
//                .map(String::valueOf)
//                .collect(Collectors.toUnmodifiableList());
//
//        String join = String.join(" ", filteredTokens);
//
//        System.out.println(join);
//    }
}
