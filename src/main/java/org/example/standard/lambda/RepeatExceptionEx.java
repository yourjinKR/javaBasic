package org.example.standard.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.function.Supplier;
import org.example.Console;

public class RepeatExceptionEx {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        while (true) {
//            try {
//                System.out.println("숫자 입력");
//                String a = br.readLine();
//                String b = br.readLine();
//                int result = sum(a,b);
//                System.out.println(result);
//                break;
//            } catch (Exception e) {
//                System.out.println("다시 입력");
//            }
//        }

        Integer result = repeatRun(() -> {
            System.out.println("숫자 2개를 입력하시오");
            String a = Console.readLine();
            String b = Console.readLine();
            return sum(a, b);
        });

        System.out.println(result);

    }

    static public int sum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    static public <T> T repeatRun(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (Exception e) {
                System.out.println("에러 발생, 재실행");
            }
        }
    }
}


