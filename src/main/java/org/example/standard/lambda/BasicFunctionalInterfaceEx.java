package org.example.standard.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BasicFunctionalInterfaceEx {
    public static void main(String[] args) {
        // 매개변수 X, 반환값 X
        Runnable runnable = () -> System.out.println("runnable");
        runnable.run();

        // 매개변수 X, 반환값 O
        Supplier<String> supplier = () -> "supplier";
        System.out.println(supplier.get());

        // 매개 변수 O, 반환값 X
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("consumer");

        // 매개변수 O, 반환값 O
        Function<String, String> function = (String s) -> s;
        System.out.println(function.apply("function"));

        // 매개변수 O, 반환값 Boolean
        Predicate<String> predicate = (String s) -> true;
        System.out.println(predicate.test("") ? "predicate" : "XXXXXX");

        // 매개변수 2개, 반환값 X
        BiConsumer<String, String> biConsumer =
                (s1, s2) -> System.out.println(s1 + s2);
        biConsumer.accept("bi", "consumer");

        // 매개변수 2개, 반환값 Boolean
        BiPredicate<String, String> biPredicate =
                (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate.test("bi", "bi") ? "bipredicate" : "XXXX");

        // 매개변수 2개, 반환값 1개
        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + s2;
        System.out.println(biFunction.apply("bi", "function"));

        // 매개변수 1개, 반환값 1개, 타입 일치
        UnaryOperator<String> unaryOperator = (s -> "unary" + s);
        System.out.println(unaryOperator.apply("operator"));

        // 매개변수 2개, 반환값 1개, 타입 일치
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("binary", "operator"));


    }
}
