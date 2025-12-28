package org.example.standard.annotation;

import java.lang.annotation.Repeatable;

public class RepeatableEx {

    @Repeatable(ToDodos.class)
    @interface Todo{
        String value();
        String detail() default "";
    }

    @interface ToDodos {
        Todo[] value();
    }

    @interface WillBe {
        String value() default "성공함";
    }

    @interface MyGoal {
        String[] value() default {"취업", "연애", "가족의 행복"};
    }

    public static void main(String[] args) {

    }

    @Todo(value = "자바 어노테이션 공부하기")
    @Todo(
            value = "개인 프로젝트 PR 1개 커밋",
            detail = "유저 프로필 조회 API 구현"
    )
    static class Today { }

    @WillBe
    @MyGoal(value = { "취업", "가족의 행복" })
    static class ToDo2026 {}
}
