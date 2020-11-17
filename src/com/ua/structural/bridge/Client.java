package com.ua.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufactue();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufactue();
    }
}
