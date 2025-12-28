package org.example.standard.collection.set;

import java.util.EnumSet;

public class EnumSetEx {
    public static void main(String[] args) {
        // AbstractSet이기에 new 연산을 통한 객체 생성이 불가함

        // 1. 특정 요소만 담기
        EnumSet<Style> styles = EnumSet.of(Style.BOLD, Style.ITALIC);

        // 2. 모든 요소 담기
        EnumSet<Style> allStyles = EnumSet.allOf(Style.class);

        // 3. 비어있는 셋 만들기
        EnumSet<Style> emptyStyles = EnumSet.noneOf(Style.class);

        // 4. 범위 지정 (BOLD부터 UNDERLINE까지)
        EnumSet<Style> rangeStyles = EnumSet.range(Style.BOLD, Style.UNDERLINE);
    }
}

enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }
