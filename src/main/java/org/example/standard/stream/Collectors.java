package org.example.standard.stream;

import java.util.List;

public class Collectors {
    public static void main(String[] args) {


        List<Member> members = List.of(
                new Member(1),
                new Member(2),
                new Member(3)
        ) ;

        List<Integer> list = members.stream()
                .map(member -> member.age + 1)
                .toList();




    }
}
