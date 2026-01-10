package org.example.standard.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapEx {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("hello");

        Optional<String> s1 = opt.map(String::toUpperCase);
        System.out.println(s1);

        Optional<String> s2 = opt.flatMap(s -> Optional.of(s.toUpperCase()));
        System.out.println(s2);

        List<Item> items = List.of(
                new Item(1),
                new Item(2),
                new Item(3),
                new Item(4),
                new Item(5),
                new Item(6)
        );

        Data data = new Data(1, items);

        Stream.of(data)
                .flatMap(d -> d.getItems().stream())
                .forEach(i -> System.out.println(i.getId()));
    }
}

class Data {
    private int id;
    private List<Item> items;

    public Data(int id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }
}

class Item {
    private int id;

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
