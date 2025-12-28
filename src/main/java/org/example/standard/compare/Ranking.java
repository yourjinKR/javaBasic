package org.example.standard.compare;

import java.util.Comparator;

public class Ranking implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.level, o2.level);
    }
}
