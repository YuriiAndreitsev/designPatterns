package com.ua.structural.flyweight.shapesExample;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightShapeFactory {

    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) throws Exception {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
                default:
                    throw new Exception("unsupported shape type");
            }
        }
        return shape;
    }
}
