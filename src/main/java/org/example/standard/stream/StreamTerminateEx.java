package org.example.standard.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminateEx {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("1", "2", "3");
        System.out.println(stream.findAny());

        int[] nums = IntStream.rangeClosed(1, 100).toArray();

        int result1 = Arrays.stream(nums)
                .reduce(0, Integer::sum);

        System.out.println(result1);

        int result2 = Arrays.stream(nums)
                .sum();
        System.out.println(result2);


    }
}
