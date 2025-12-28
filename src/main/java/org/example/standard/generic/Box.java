package org.example.standard.generic;

public class Box<T> {
    public T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
