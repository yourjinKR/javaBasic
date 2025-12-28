package org.example.standard.collection.iterator;

import java.util.List;

public class ExceptionEx {
    public static void main(String[] args) {
        List<String> li = new java.util.ArrayList<>(List.of("1", "2", "3"));

        for (String s : li) {
            if ("1".equals(s)) {
                li.remove(s);
            }
        }
    }
}
