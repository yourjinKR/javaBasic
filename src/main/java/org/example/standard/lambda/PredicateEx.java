package org.example.standard.lambda;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;

        // 두 Predicate를 하나로 결합할 수 있다.
        // and(), or(), negate()가 있음
        Predicate<Integer> and = p.and(r);

        System.out.println(and.test(100));
        System.out.println(and.test(10));
    }
}
