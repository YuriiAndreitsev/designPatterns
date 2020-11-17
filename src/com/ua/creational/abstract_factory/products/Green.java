package com.ua.creational.abstract_factory.products;

import com.ua.creational.abstract_factory.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("INSIDE GREEN FILL() method!");
    }
}
