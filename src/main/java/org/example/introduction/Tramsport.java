package org.example.introduction;

public interface Tramsport {
    default void go() {
        System.out.println("Транспорт едет");
    }
}
