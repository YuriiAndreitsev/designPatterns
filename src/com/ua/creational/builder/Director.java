package com.ua.creational.builder;

public class Director {
    Builder builder;

    public void construct (Builder builder){
        builder = builder;
        builder.buildBody();
        builder.buildLights();
        builder.buildWheels();
    }
}
