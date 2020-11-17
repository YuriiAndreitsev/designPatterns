package com.ua.creational.factory.strict;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();
        Shape shape2 = new SquareFactory().getShape();
        shape2.draw();
        Shape shape3 = new RectangleFactory().getShape();
        shape3.draw();
    }
}
