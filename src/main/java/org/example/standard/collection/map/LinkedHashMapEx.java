package org.example.standard.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 값 넣기
        map.put(2, "유재석");
        map.put(1, "유어진");
        map.put(3, "유지민");
        System.out.println(map); // {2=유재석, 1=유어진, 3=유지민}

        map.put(1, "기존 순서에 맞게 값 변경");
        System.out.println(map);
        // {2=유재석, 1=기존 순서에 맞게 값 변경, 3=유지민}
    }
}
