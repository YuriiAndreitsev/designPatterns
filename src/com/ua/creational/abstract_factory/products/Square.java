package com.ua.creational.abstract_factory.products;

import com.ua.creational.abstract_factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("INSIDE SQUARE DRAW METHOD");
    }
}
