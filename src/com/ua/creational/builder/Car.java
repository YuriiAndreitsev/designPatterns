package com.ua.creational.builder;

public class Car implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Some body of a car!");
    }

    @Override
    public void buildWheels() {
        product.add("4 wheels are installed");
    }

    @Override
    public void buildLights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
