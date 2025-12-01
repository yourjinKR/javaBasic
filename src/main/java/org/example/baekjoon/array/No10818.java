package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 정수 갯수 입력
        int N = Integer.parseInt(br.readLine());

        List<Integer> tokens = Arrays.stream(br.readLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toUnmodifiableList());

        int min = Collections.min(tokens);
        int max = Collections.max(tokens);

        System.out.println(sb.append(min).append(" ").append(max));
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        // 정수 갯수 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 수열 입력
//        String[] tokens = br.readLine().split(" ");
//
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(tokens[i]);
//        }
//
//        OptionalInt max = Arrays.stream(arr).max();
//        OptionalInt min = Arrays.stream(arr).min();
//
//        if (min.isPresent()) {
//            sb.append(min.getAsInt());
//        }
//
//        sb.append(" ");
//
//        if (max.isPresent()) {
//            sb.append(max.getAsInt());
//        }
//
//        System.out.println(sb);
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        // 정수 갯수 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 수열 입력
//        List<Integer> tokens = Arrays.stream(br.readLine().split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toUnmodifiableList());
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int token : tokens) {
//            if (token < min) {
//                min = token;
//            }
//
//            if (token > max) {
//                max = token;
//            }
//        }
//
//        // 출력
//        System.out.println(sb.append(min).append(" ").append(max));
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        // 정수 갯수 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 수열 입력
//        List<Integer> tokens = Arrays.stream(br.readLine().split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toUnmodifiableList());
//
//        int max = tokens.stream().max(Integer::max).get();
//        int min = tokens.stream().min(Integer::min).get();
//
//        // 출력
//        System.out.println(sb.append(min).append(" ").append(max));
//    }
}
