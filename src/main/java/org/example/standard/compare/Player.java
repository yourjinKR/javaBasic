package org.example.standard.compare;

public class Player implements Comparable<Player> {
    String name;
    int level;
    int power;
    int hp;

    public Player(String name, int level, int power, int hp) {
        this.name = name;
        this.level = level;
        this.power = power;
        this.hp = hp;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.hp, o.hp);
    }

    @Override
    public String toString() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
