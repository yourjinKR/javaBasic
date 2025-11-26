package org.example.baekjoon.input;

import java.util.Arrays;
import java.util.Scanner;

public class No11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Long result = Arrays.stream(input.split(" "))
                .mapToLong(Long::parseLong)
                .sum();

        System.out.println(result);
    }

    // 상수 범위를 확인 후 Int or Long 둘 중 하나 사용
}

/*
    1. NumberFormatException

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer result = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(result);
    }
 */
