package org.example.baekjoon.input;

import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long B1 = (B % 100) % 10;
        long B10 = (B % 100) / 10;
        long B100 = B / 100;

        long step1 = A * B1;
        long step2 = A * B10;
        long step3 = A * B100;

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);

        System.out.println(step1 + (step2 * 10) + (step3 * 100));
    }
}
