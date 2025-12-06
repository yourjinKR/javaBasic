package org.example.standard;

class A {
    public void method(I i) {
        i.method();
    }
}

// 인터페이스 추가
interface I {
    public void method();
}

class B implements I {
    public void method() {
        System.out.println("B class Method");
    }
}

class C implements I {
    public void method() {
        System.out.println("C class Method");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C()); // A가 B를 사용
    }
}
