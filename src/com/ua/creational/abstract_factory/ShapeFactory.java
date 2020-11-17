package com.ua.creational.abstract_factory;

import com.ua.creational.abstract_factory.products.*;

public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
      return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
