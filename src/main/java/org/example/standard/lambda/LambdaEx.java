package org.example.standard.lambda;


import java.security.PrivilegedAction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;

public class LambdaEx {
    public static void main(String[] args) {


        IntBinaryOperator intBinaryOperator =
                (int a, int b) -> a > b ? a : b;

        IntBinaryOperator intBinaryOperator1 = (int a, int b) -> {
            return a > b ? a : b;
        };

        IntBinaryOperator intBinaryOperator2 =
                (a, b) -> a > b ? a : b;

        int i1 = intBinaryOperator.applyAsInt(1, 2);
        System.out.println(i1);

        ObjIntConsumer<String> stringObjIntConsumer =
                (String name, int i) -> System.out.println(name + "=" + i);

        IntFunction<Integer> integerIntFunction = (x) -> x * x;

        PrivilegedAction<Integer> integerPrivilegedAction = () -> (int) (Math.random() * 6);

        // 자바에서 람다식은 엄밀히 따지면 익명 함수가 아닌 익명 객체이다!
        // TODO : 얘는 어떻게 사용하지?
        Object intBinaryOperatorByObject = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };


    }

    int max(int a, int b) {
        return a > b ? a : b;
    }
}
