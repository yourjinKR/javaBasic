package org.example.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    갯수를 파악한다, 즉 중복을 허용하지 않으므로
    set를 사용할 수 있었다.
    단계별 풀이가 배열이었기에 배열로만 생각한 점이 아쉽다.
    자료구조를 더 활용하자.
 */
public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(set.size());
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            int value = Integer.parseInt(br.readLine()) % 42;
//
//            if (!arr.contains(value)) {
//                arr.add(value);
//            }
//        }
//
//        System.out.println(arr.size());
//    }
}
