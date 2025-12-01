package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*

toList()는 Java 16에서 추가한 기능이므로 사용 X
하지만 설명상 편의를 위해 .collect(Collectors.toUnmodifiableList()) 를 toList()로 설명하겠음

여러 방식으로 풀 수 있음.
1. filter().toList()
2. 배열을 사용하여 반복문 내 조건문을 통해 구현
3. Collections.frequency(collections, value)로 구현 가능

 */
public class No10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 갯수 입력
        int N = Integer.parseInt(br.readLine());

        // 정수 토큰 입력
        List<Integer> tokens = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toUnmodifiableList());

        // 찾고자 하는 숫자 입력
        int v = Integer.parseInt(br.readLine());

        // 갯수 파악
        int result = Collections.frequency(tokens, v);

        // 갯수를 출력
        System.out.println(result);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 갯수 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 정수 토큰 입력
//        String[] tokens = br.readLine().split(" ");
//
//        // 찾고자 하는 숫자 입력
//        int v = Integer.parseInt(br.readLine());
//
//        // 갯수 파악
//        int count = 0;
//
//        for (int i = 0; i < N; i++) {
//            int parsedInt = Integer.parseInt(tokens[i]);
//            if (parsedInt == v) {
//                count++;
//            }
//        }
//
//        // 갯수를 출력
//        System.out.println(count);
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 갯수 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 정수 토큰 입력
//        String[] tokens = br.readLine().split(" ");
//
//        // 찾고자 하는 숫자 입력
//        int v = Integer.parseInt(br.readLine());
//
//        // 갯수 파악
//        int[] arr = new int[N];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(tokens[i]);
//        }
//
//        int count = 0;
//
//        for (int value : arr) {
//            if (value == v) {
//                count++;
//            }
//        }
//
//        // 갯수를 출력
//        System.out.println(count);
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 갯수 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 정수 토큰 입력
//        List<Integer> tokens = Arrays.stream(br.readLine().split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toUnmodifiableList());
//
//        // 찾고자 하는 숫자 입력
//        int v = Integer.parseInt(br.readLine());
//
//        // 갯수 파악
//        List<Integer> filteredTokens = tokens.stream()
//                .filter(integer -> integer == v)
//                        .collect(Collectors.toUnmodifiableList());
//
//        // 갯수를 출력
//        System.out.println(filteredTokens.size());
//    }
}
