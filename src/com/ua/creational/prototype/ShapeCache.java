package com.ua.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable <String,Shape> shapeMap = new Hashtable<>();
    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape chachedShape = shapeMap.get(shapeId);
        return (Shape) chachedShape.clone();
    }

    public static void loadChache (){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
