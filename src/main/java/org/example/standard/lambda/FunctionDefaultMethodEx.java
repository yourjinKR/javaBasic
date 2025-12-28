package org.example.standard.lambda;

import java.util.function.Function;

public class FunctionDefaultMethodEx {
    public static void main(String[] args) {

        Function<String, Integer> fun1 = s -> Integer.parseInt(s, 16);
        Function<Integer, String> fun2 = i -> Integer.toBinaryString(i);

        Function<String, String> fun3 = fun1.andThen(fun2);
        Function<String, String> fun4 = fun2.compose(fun1);

        System.out.println(fun3.apply("12"));
        System.out.println(fun4.apply("12"));
    }
}
