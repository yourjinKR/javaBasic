package org.example.selfmade.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * 일급 컬렉션이란?
 */
public class FirstCollection {
    public static void main(String[] args) {

        List<String> basicList = new ArrayList<>();
        basicList.add("19580415");
        basicList.add("19970201");
        // 원시값은 검증과 같은 비지니스 로직을 입히기 힘듬
        basicList.add("200003201111");

        System.out.println(basicList);

        // 일급 컬렉션은 비지니스 로직을 내부에 저장하여 관리
        BirthStringList firstCollection = new BirthStringList(basicList);

        System.out.println(firstCollection);
    }
}

class BirthStringList {
    private static final int LENGTH = 8;
    private List<String> birtStringList;

    public BirthStringList(List<String> birtStringList) {
        validateLength(birtStringList);
        this.birtStringList = birtStringList;
    }

    public void validateLength(List<String> birthStringList) {
        birthStringList.forEach(this::validateLength);
    }

    public void validateLength(String birthString) {
        if (birthString.length() != 8) {
            throw new IllegalArgumentException("생년월일은 8글자입니다.");
        }
    }
}