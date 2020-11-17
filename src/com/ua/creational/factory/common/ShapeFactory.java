package com.ua.creational.factory.common;

public class ShapeFactory {
    public Shape getShapeMethod(String shapeName) {
        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
