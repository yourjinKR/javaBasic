package org.example.standard.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerateEx {
    public static void main(String[] args) throws IOException {
        // 빈 스트림
        Stream<String> emptyString = Stream.empty();
        Stream<Integer> emptyInteger = Stream.empty();

        // 컬렉션
        Stream<String> stringStream = List.of("dd","aa","cc").stream();

        // 배열
        String[] arr = {"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        // 빌더
        Stream<String> streamBuilder =
                Stream.<String>builder()
                        .add("a")
                        .add("b")
                        .add("c")
                        .build();

        // generate()
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);


        // 기본형 스트림
        IntStream range = IntStream.range(1, 5); // 1~4
        IntStream intStream = IntStream.rangeClosed(1, 5);// 1~5

        // 무한 스트림

        // 생성
        Stream<Double> randoms = Stream.generate(Math::random);
        // 반복
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1);
        // 사용
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        // 반드시 limit 설정
        randoms.limit(5).forEach(System.out::println);

        // 1 ~ 10까지의 숫자를 출력
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        // 문자열 배열을 대문자로 변환 후 출력
        String[] strings = {"aaa", "bbbb", "cc"};
        Arrays.stream(strings)
                .forEach(s -> System.out.println(s.toUpperCase(Locale.ROOT)));
        // 무한 스트림에서 짝수 5개만 출력
        Stream.iterate(1, n -> n + 1)
                .filter(num -> num % 2 == 0)
                .limit(5)
                .forEach(System.out::println);

    }

}

class Man {
    private int age;
    private String name;

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}