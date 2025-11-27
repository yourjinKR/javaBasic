package org.example.baekjoon.condition;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class No1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> parsedInput = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toUnmodifiableList());

        int gap = parsedInput.get(0) - parsedInput.get(1);

        if (gap > 0) {
            System.out.println(">");
        } else if (gap < 0) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
