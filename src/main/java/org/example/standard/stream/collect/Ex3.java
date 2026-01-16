package org.example.standard.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

record Product(String category, String name) {}

public class Ex3 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("FOOD", "Apple"),
                new Product("FOOD", "Apple"),
                new Product("FOOD", "Banana"),
                new Product("BOOK", "Java"),
                new Product("BOOK", "Spring")
        );

        Map<String, Set<String>> namesByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::category,
                        Collectors.mapping(Product::name, Collectors.toSet())
                ));

        System.out.println(namesByCategory);
    }
}
