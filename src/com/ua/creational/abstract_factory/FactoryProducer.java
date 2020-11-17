package com.ua.creational.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType == null) {
            return null;
        } else if (factoryType.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
