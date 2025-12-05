package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*

횟수만큼 단어를 입력 받는다.
입력 받은 단어를 순회한다.
새로운 알파벳이면 같은 알파벳이 나올때까지 조회한다.

 */

public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean result = isGroupWord(word);
            if (result) count ++;
        }

        System.out.println(count);
    }

    /**
     * 특정 단어의 중복 여부를 판단
     * @param word 문자열
     */
    public static boolean isGroupWord(String word) {
        // 알파벳 리스트
        List<Character> charList = new ArrayList<>();
        // 글자 수 길이 만큼 반복
        for (int i = 0; i < word.length(); i++) {
            // 알파벳 선택
            char c = word.charAt(i);
            // 이미 사용된 알파벳이라면 0
            if (charList.contains(c)) {
                return false;
            }
            // 사용된 적 없다면 리스트에 추가
            else {
                charList.add(c);
                // 처음 사용되는 알파벳이라면 연속성 검사
                while (true) {
                    int nextIndex = i+1;
                    // 인덱스 범위 넘어가지 않도록 방지
                    if (nextIndex == word.length()) break;

                    char nextC = word.charAt(nextIndex);
                    // 다음 인덱스의 알파벳이 같다면 연속성 확인 반복
                    if (c == nextC) {
                        i++;
                    }
                    // 다르다면 반복문 종료
                    else {
                        break;
                    }
                }
            }
        }

        return true;
    }
}
