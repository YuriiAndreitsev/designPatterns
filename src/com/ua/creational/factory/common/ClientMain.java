package com.ua.creational.factory.common;

public class ClientMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShapeMethod("circle");
        circle.draw();
        Shape square = shapeFactory.getShapeMethod("square");
        square.draw();
        Shape rectangle = shapeFactory.getShapeMethod("rectangle");
        rectangle.draw();
    }
}
