package org.example.standard.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {

        // 동기화
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        // 변경 불가 컬렉션
        List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<>());

        // 싱글톤
        List<String> singletonList = Collections.singletonList("1");
        System.out.println(singletonList);

        singletonList = Collections.emptyList(); // emptyList() 로 초기화
        System.out.println(singletonList);

        singletonList = List.of("1");
        System.out.println(singletonList);

        // UnsupportedOperationException
        // singletonList.add("2");

        List<String> list1 = new ArrayList<>(List.of("4", "3", "6", "1"));
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        String min = Collections.min(list1);
        System.out.println(min);

        String max = Collections.max(list1);
        System.out.println(max);

        Collections.shuffle(list1);
        System.out.println(list1);

        List<Person> people = new ArrayList<>();
        people.add(new Person(10));
        people.add(new Person(20));
        people.add(new Person(30));
        people.add(new Person(30));
        people.add(new Person(40));

        Person maxPerson = Collections.max(people);
        System.out.println(maxPerson); // Person{age=40}
    }
}

class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        // return this.age > o.age ? 1 : this.age == o.age ? 0 : -1;
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}