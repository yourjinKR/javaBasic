package org.example.standard.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareEx {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("마법사", 12, 30, 5));
        players.add(new Player("도적" ,11, 25, 20));
        players.add(new Player("궁수" ,13, 12, 30));
        players.add(new Player("싸움꾼", 15, 6, 50));
        players.add(new Player("기사", 11, 3, 100));

        Collections.sort(players);
        System.out.println("체력 순 : " + players);
        // 체력 순 : [마법사, 도적, 궁수, 싸움꾼, 기사]

        Ranking ranking = new Ranking();
        players.sort(ranking);
        System.out.println("레벨 순 : " + players);
        // 레벨 순 : [도적, 기사, 마법사, 궁수, 싸움꾼]
    }
}

