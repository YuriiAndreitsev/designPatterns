package com.ua.structural.flyweight.shapesExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        FlyWeightShapeFactory factory = new FlyWeightShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        try {

            shapes.add(factory.getShape("square"));
            shapes.add(factory.getShape("square"));
            shapes.add(factory.getShape("point"));
            shapes.add(factory.getShape("circle"));
            shapes.add(factory.getShape("point"));
            shapes.add(factory.getShape("circle"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Random randomInteger = new Random();

        for (Shape shape : shapes) {
            int x = randomInteger.nextInt(100);
            int y = randomInteger.nextInt(100);
            shape.draw(x, y);
        }
    }
}
