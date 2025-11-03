package org.example.selfmade.functional.tripleParams;

interface TripleConsumer<T, U, K> {
    void accept(T t, U u, K k);
}
