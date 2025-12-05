package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/*

크로아티아 알파벳은 컬렉션으로 관리.
- 앞글자를 기준으로 검색하도록 아래와 같은 컬렉션으로 설정

입력값을 어떤 타입으로 받을까?
- String으로 받자.

String을 순회하여 값을 확인함.
- 값을 확인하는 방식은?

 */
public class No2941 {
    public static Map<Character, List<String>> ALPHABET = Map.of(
            'c', List.of("c=", "c-"),
            'd', List.of("dz=", "d-"),
            'l', List.of("lj"),
            'n', List.of("nj"),
            's', List.of("s="),
            'z', List.of("z=")
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int i = 0; // 인덱스 순회 상태
        int count = 0; // 글자 수 상태

        while (input != null && i < input.length()) {
            char c = input.charAt(i);

            if (ALPHABET.containsKey(c)) {
                List<String> wordList = ALPHABET.get(c);

                boolean condition2 = i+2 <= input.length();
                boolean condition3 = i+3 <= input.length();

                if (condition2) {
                    String word1 = input.substring(i, i+2);
                    if (wordList.contains(word1)) {
                        i += 2;
                        count++;
                        continue;
                    }
                }

                if (condition3) {
                    String word2 = input.substring(i, i+3);
                    if (wordList.contains(word2)) {
                        i += 3;
                        count++;
                        continue;
                    }
                }

                i++;
                count++;

            } else {
                i++;
                count++;
            }
        }

        System.out.println(count);
    }

//    public static Set<String> ALPHABET = Set.of(
//            "c=",
//            "c-",
//            "dz=",
//            "d-",
//            "lj",
//            "nj",
//            "s=",
//            "z="
//    );


    // 정규식을 활용한 풀이법
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String sep = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "0");

        System.out.print(sep.length());
    }
}
