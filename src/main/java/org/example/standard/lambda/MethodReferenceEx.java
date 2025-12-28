package org.example.standard.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReferenceEx {

    // 하나의 메서드만 호출하는 람다식은 메서드 참조로 간단히 할 수 있다.
    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("유어진");

        Consumer<String> methodReference = System.out::println;
        methodReference.accept("유어진");

        BiConsumer<String, String> biMethodRef = MethodReferenceEx::printBi;
        biMethodRef.accept("유", "어진");
    }

    static public void printBi(String s1, String s2) {
        System.out.println(s1 + s2);
    }
}
