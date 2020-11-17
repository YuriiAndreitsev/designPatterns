package com.ua.creational.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private List<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\nProduct completed as below:");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }

}
