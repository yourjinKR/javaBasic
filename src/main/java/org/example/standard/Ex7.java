package org.example.standard;

public class Ex7 {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.buy(new Computer());
        consumer.buy(new Mouse());
        consumer.buy(new TV());

        Product p[] = new Product[3];
        p[0] = new Computer();
        p[1] = new Mouse();
        p[2] = new TV();


        Fighter f1 = new Fighter(100,"싸움꾼");
        Fighter f2 = new Fighter(10, "적");

        f1.fight(f2);
    }
}

class Fighter extends Unit implements Fightable {
    public Fighter(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }
    @Override
    public void fight(Fightable enemy) {
        System.out.println(this + "이(가) " + enemy + "랑 싸운다.");
    }
    @Override
    public Fightable win(Fighter enemy) {
        Fighter target = new Fighter(enemy.hp, enemy.name);
        target.hp = 0;
        return target;
    }
}

abstract class Unit {
    int hp;
    String name;
    @Override
    public String toString() {
        return this.name;
    }
}
interface Fightable {
    void fight(Fightable enemy);
    Fightable win(Fighter enemy);
}

interface Interface {
    int v = 10;
    int method();
}

abstract class AbstractClass {
    abstract void method();
}

abstract class Player {
    abstract void play();
}

class SoccerPlayer extends Player {
    @Override
    void play() {
        System.out.println("Soccer play");
    }

    void play(String msg) {
        System.out.println("Soccer play: " + msg);
    }
}

class Car {
    int door;
}

class FireEngine extends Car {
    int door;

    void water() {
        System.out.println("물 뿌림");
    }

    void doWork(Car c) {
        if (c instanceof FireEngine) {
            FireEngine f = (FireEngine) c;
            f.water();
        }
    }
}

class Consumer {
    int money;
    Consumer() {
        money = 1_000_000;
    }

    void buy(Product product) {
        money -=  product.price;
    }
}

class Product {
    int price = 100;
    public Product() {}
}

class Computer extends Product {}
class Mouse extends Product {}
class TV extends Product {}