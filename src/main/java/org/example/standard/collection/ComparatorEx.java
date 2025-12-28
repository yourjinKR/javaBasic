package org.example.standard.collection;

import java.util.Arrays;
import java.util.Collections;

public class ComparatorEx {
    public static void main(String[] args) {
        Integer[] arr = { 20, 10, 50, 30, 40 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50]

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr)); // [50, 40, 30, 20, 10]
    }
}
