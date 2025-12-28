package org.example.standard.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();

        integers.add(7);
        integers.add(4);
        integers.add(9);
        integers.add(1);
        integers.add(5);

        System.out.println(integers.first()); // 1
        System.out.println(integers.last()); // 9

        System.out.println(integers.lower(4)); // 1
        System.out.println(integers.higher(7)); // 9

        System.out.println(integers.ceiling(4)); // 4
        System.out.println(integers.floor(7)); // 7


        integers.remove(9);

        System.out.println(integers); // [1, 4, 5, 7]

    }
}
