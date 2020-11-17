package com.ua.creational.factory.staticMethod;

import com.ua.creational.factory.common.Rectangle;
import com.ua.creational.factory.common.Shape;

public class ShapeStaticFactory {
    public static Shape getShapeMethod(String shapeName) {
        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("circle")) {
            return new com.ua.creational.factory.common.Circle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new com.ua.creational.factory.common.Square();
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
