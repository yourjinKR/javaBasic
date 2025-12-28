package org.example.standard.generic;

import java.util.ArrayList;

public class ExtendEx {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<Apple>();
        appleBox.setItem(new Apple());
        // appleBox.setItem(new Fruit()); 불가능!!!

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.setItem(new Apple());

        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();

        fruitFruitBox.items.add(new Fruit());
        appleFruitBox.items.add(new Apple());


        Apple apple = new Apple();
        Fruit fruit = apple;

        Box<Apple> appleBox1 = new Box<>();
        // Box<Fruit> fruitBox1 = appleBox1; // 불가능

        Box<? extends Fruit> fruitBox2 = appleBox1;

    }

    static class Fruit {
        public void name() {
            System.out.println("과일");
        }
    }

    static class Apple extends Fruit {
        @Override
        public void name() {
            System.out.println("사과");
        }
    }

    static class FruitBox<T extends Fruit> {
        public ArrayList<T> items = new ArrayList<>();
    }

}
