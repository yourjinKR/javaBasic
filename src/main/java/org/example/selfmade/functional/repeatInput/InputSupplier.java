package org.example.selfmade.functional.repeatInput;

@FunctionalInterface
public interface InputSupplier<T> {
    T get() throws Exception;
}