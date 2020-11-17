package com.ua.creational.factory.staticMethod;

import com.ua.creational.factory.common.Shape;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeStaticFactory.getShapeMethod("circle");
        circle.draw();
        Shape square = ShapeStaticFactory.getShapeMethod("square");
        square.draw();
        Shape rectangle = ShapeStaticFactory.getShapeMethod("rectangle");
        rectangle.draw();
    }
}
