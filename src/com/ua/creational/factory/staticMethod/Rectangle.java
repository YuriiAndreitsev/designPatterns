package com.ua.creational.factory.staticMethod;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("INSIDE RECTANGLE DRAW METHOD");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("INSIDE SQUARE DRAW METHOD");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("INSIDE CIRCLE DRAW METHOD");
    }
}