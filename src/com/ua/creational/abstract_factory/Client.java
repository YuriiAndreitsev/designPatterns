package com.ua.creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Color red = colorFactory.getColor("red");
        red.fill();

    }
}
