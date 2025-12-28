package org.example.standard.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceEx {

    public static void main(String[] args) {

        Myfunction oldFunction = new Myfunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        // 람다식(익명 객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        Myfunction myfunction = (a, b) -> a > b ? a: b;

        int max = myfunction.max(1, 2);
        System.out.println(max);

        List<String> list = Arrays.asList("8", "2", "5", "4", "1");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(list);

        RepeatException<String, Integer> repeat = (String s) -> {
            try {
              return  Integer.parseInt(s);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(e);
            }
        };

        Integer run = repeat.run("1asdasda2");
        System.out.println(run);
    }

    @FunctionalInterface
    interface Myfunction {
        int max(int a, int b);
    }

    @FunctionalInterface
    interface RepeatException<V, R> {
        R run(V value);
    }
}
