package org.example.standard.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // 값 넣기
        map.put(2, "유재석");
        map.put(1, "유어진");
        map.put(3, "유지민");
        System.out.println(map); // {1=유어진, 2=유재석, 3=유지민}

        // 여러 값 넣기
        Map<Integer, String> map2 = Map.of(4, "유어진", 5, "유재석");
        map.putAll(map2);
        System.out.println(map);

        // 값 제거
        map.remove(4);
        map.remove(5, "유재석");
        System.out.println(map);

        // 값 얻기
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(5, "없음 말고"));

        // 키, 값 여부 확인
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("유지민"));

        // 키와 값을 얻기
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        Collection<String> values = map.values();
        System.out.println(values);

        // Entry에 대한 개념
        Set<Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
    }
}
