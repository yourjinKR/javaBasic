package org.example.standard.collection.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {

        List<String> list = List.of("유어진", "최재원", "윤준혁");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        사실 이와 같이 간단히 구현 가능하나,
        Iterator를 사용한다면 Collection들을 표준화하여 반복시킬 수 있다.
         */
        for (String s : list) {
            System.out.println(s);
        }
    }
}
