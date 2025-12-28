package org.example.standard.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<String> hashSet = Set.of("1번", "2번", "3번");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("1번");
        linkedHashSet.add("2번");
        linkedHashSet.add("3번");

        System.out.println(hashSet); // [1번, 3번, 2번]
        System.out.println(linkedHashSet); // [1번, 2번, 3번]
    }
}
