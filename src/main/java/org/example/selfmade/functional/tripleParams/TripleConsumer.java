package org.example.selfmade.functional.tripleParams;

@FunctionalInterface
interface TripleConsumer<T, U, K> {
    void accept(T t, U u, K k);
}
