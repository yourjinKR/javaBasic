package org.example.standard.generic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiTypeEx {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        Board<Integer, String> board = new Board<>(data);

        board.data.put(1, "유어진");
        board.data.put(2, "유재석");
        board.data.put(3, "유지민");
    }

    static class Board<K, V> {
        public Map<K, V> data;

        public Board(Map<K, V> data) {
            this.data = data;
        }
    }

    static class HowManyTest<A, B, C, D, E, F, G, H, I, J, K> {

    }
}
