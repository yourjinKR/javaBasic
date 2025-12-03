package org.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();

        Map<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (dictionary.containsKey(c)) {
                dictionary.compute(c, (k, count) -> count + 1);
            } else {
                dictionary.put(c, 1);
            }
        }

        Collection<Integer> values = dictionary.values();
        int max = values.stream().max(Comparator.naturalOrder()).orElse(0);

        char rank = 0;
        int count = 0;

        for (char key : dictionary.keySet()) {
            if (dictionary.get(key) == max) {
                rank = key;
                count += 1;
            }
        }

        System.out.println(count == 1 ? String.valueOf(rank) : "?");
    }

    /*

    toCharArray로 char collection을 기반으로 순회
    char 타입은 문자를 int형으로 저장 가능하기에 (아스키 코드)
    이를 활용하여 값을 직접 저장하는 것이 아닌 인덱스의 값으로 문자를 얻어냄

     */
    private static String solution(String str){
        int[] cntArr = new int[26];

        int max = 0;
        for(char c: str.toCharArray()){
            c = Character.toLowerCase(c);
            cntArr[c-'a']++;
            if(cntArr[c-'a'] > max) max = cntArr[c-'a'];
        }

        int cnt = 0;
        int idx = 0;
        for(int i=0;i<26;i++){
            if(max==cntArr[i]){
                cnt++;
                idx = i;
            }
        }

        return cnt > 1 ? "?" : String.valueOf((char)(idx+'A'));
    }
    public static void main2(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
