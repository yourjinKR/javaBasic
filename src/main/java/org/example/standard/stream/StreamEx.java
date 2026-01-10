package org.example.standard.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        // optional를 반환
        System.out.println(stream.max(Integer::compare));

        System.out.println("스트림 생성 -> 중간 연산 -> 최종 연산");
        List<Integer> integers = List.of(9, 8, 3, 4, 5);
        integers.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);

        System.out.println("특징 1. 원본 데이터를 읽기만할 뿐 변경하지 않음");
        List<Integer> sortedList = integers.stream().sorted().toList();
        System.out.println(integers);
        System.out.println(sortedList);


        try {
            System.out.println(stream.max(Integer::compare).isPresent());
        } catch (Exception e) {
            System.out.println("특징 2. stream은 1회용");
        }

        System.out.println("특징 3. 최종 연산 전까지 중간연산이 수행되지 않는다");

        System.out.println("특징 4. 스내부 반복으로 처리함");

        System.out.println("틀징 5 : 병렬 스트림 지원");

        List<String> names = List.of("yoo", "ha", "kim");

        for (String name : names) {
            if (name.length() == 3) {
                System.out.println(name);
            }
        }

        names.stream()
                .filter(name -> name.length() == 3)
                .forEach(System.out::println);

        List<String> list1 = names.stream()
                .filter(name -> name.length() <= 3)
                .map(name -> name.toUpperCase(Locale.ROOT))
                .toList();

        System.out.println(list1);

        List<Integer> nums = List.of(1,2,3,4,5);
        nums.stream()
                .filter(num -> num%2 == 0)
                .forEach(num -> System.out.println(num * num));


        names.stream()
                .filter(name -> {
                    System.out.println(name + "은 세글자 이상인가?");
                    String s = name.length() >= 3 ? "네" : "아니오";
                    System.out.println(s);
                    return name.length() >= 3;
                })
                .map(n -> {
                    System.out.println("세글자 이상이니 연산 실행");
                    return n.toUpperCase(Locale.ROOT);
                })
                .forEach(System.out::println);

        List<Member> members = List.of(
                new Member(55),
                new Member(27),
                new Member(26)
        );

        List<Member> list2 = members.stream().sorted().toList();
        System.out.println(list2);

        List<Member> list3 = members.stream()
                .sorted(Comparator.comparing(Member::getAge).reversed())
                .toList();
        System.out.println(list3);
    }
}


class Member implements Comparable<Member> {

    int age;

    public Member(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Member o) {
        return this.age - o.age; // 나이 오름차순
    }

    @Override
    public String toString() {
        return "Member{" +
                "age=" + age +
                '}';
    }
}

