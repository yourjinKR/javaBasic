package org.example.standard.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Person(String name, int age, String gender) {}

public class Ex4 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("A", 28, "M"),
                new Person("B", 28, "F"),
                new Person("C", 27, "M"),
                new Person("D", 27, "M")
        );

        Map<Integer, Map<String, List<Person>>> grouped = people.stream()
                .collect(Collectors.groupingBy(
                        Person::age,
                        Collectors.groupingBy(Person::gender)
                ));

        System.out.println(grouped);
    }
}

