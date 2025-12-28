package org.example.standard.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("유어진");
        set.add("홍길동");
        set.add("유어진");
        set.add("유재석");
        set.remove("유재석");

        System.out.println(set.size()); // 2
        System.out.println(set); // [유어진, 홍길동]

        Iterator<String> iterator = set.iterator();

        // 요소 순회

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : set) {
            System.out.println(s);
        }

        // 여러 생성자

        // 기본 용량(16)과 로드 팩터(0.75)를 갖는 새로운 빈 HashSet을 생성합니다.
        HashSet<String> set1 = new HashSet<>();

        // 지정된 초기 용량과 기본 로드 팩터(0.75)를 사용하여 빈 HashSet을 생성합니다.
        HashSet<String> set2 = new HashSet<>(36);

        // 지정된 초기 용량과 로드 팩터를 가진 빈 HashSet을 생성합니다.
        HashSet<String> set3 = new HashSet<>(36, 0.5F);

        // 지정된 컬렉션의 요소를 포함하는 새로운 HashSet을 생성합니다(중복은 자동으로 제거됨).
         HashSet<String> set4 = new HashSet<>(set);

    }
}
