package org.example.standard.generic;

public class MethodEx<T> {

    // 클래스 제네릭 타입을 사용하는 메서드
    T test(T data) {
        return data;
    }

    // 제네릭 메서드
    static public <V> V process(V data) {
        return data;
    }

    public static void main(String[] args) {
        MethodEx<String> example = new MethodEx<String>();

        System.out.println(example.test("데이터"));
        System.out.println(MethodEx.<String>process("데이터"));
    }
}
