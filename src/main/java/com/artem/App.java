package com.artem;

import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Supplier<String> s = () -> "Hello World!";
        System.out.println(s.get());
    }
}
