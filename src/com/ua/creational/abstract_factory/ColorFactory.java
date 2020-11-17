package com.ua.creational.abstract_factory;

import com.ua.creational.abstract_factory.products.Blue;
import com.ua.creational.abstract_factory.products.Green;
import com.ua.creational.abstract_factory.products.Red;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
