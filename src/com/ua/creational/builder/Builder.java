package com.ua.creational.builder;

public interface Builder {
    void buildBody();
    void buildWheels();
    void buildLights();
    Product getVehicle();
}
