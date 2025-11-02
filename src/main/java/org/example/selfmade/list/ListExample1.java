package org.example.selfmade.list;

import java.util.ArrayList;
import java.util.List;


/*
    2차원 리스트 평탄화
    flatMap()을 사용
 */
public class ListExample1 {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1, 2, 3));
        matrix.add(List.of(4, 5, 6));
        matrix.add(List.of(7, 8, 9));

        List<Integer> flattenedList = matrix.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flattened List: " + flattenedList);
    }
}


