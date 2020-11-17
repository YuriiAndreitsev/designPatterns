package com.ua.creational.abstract_factory.products;

import com.ua.creational.abstract_factory.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("INSIDE RED FILL() method!");
    }
}
