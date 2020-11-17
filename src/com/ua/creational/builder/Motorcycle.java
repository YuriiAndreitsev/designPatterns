package com.ua.creational.builder;

public class Motorcycle implements Builder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Some body of a motorcycle!");
    }

    @Override
    public void buildWheels() {
        product.add("2 wheels are installed");
    }

    @Override
    public void buildLights() {
        product.add("1 headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
