package org.example.standard.generic;

import org.example.standard.generic.ExtendEx.Fruit;

public class TypeInference {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();

        // 생략 가능
        Box<Fruit> fruitBox2 = new Box<>();

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");

        // 아래 <Integer, String>는 생략해도 된다 (타입 추론)
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same ? "같음" : "다름");
    }

    static class Util {
        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey()) &&
                    p1.getValue().equals(p2.getValue());
        }
    }

    static class Pair<K, V> {

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(K key) { this.key = key; }
        public void setValue(V value) { this.value = value; }
        public K getKey()   { return key; }
        public V getValue() { return value; }
    }
}
