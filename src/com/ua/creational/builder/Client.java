package com.ua.creational.builder;

public class Client {
    public static void main(String[] args) {
        System.out.println("======= builder demo==========");
        Director director = new Director();
        Builder carBuilder = new Car();
        Builder motorcycleBuilder = new Motorcycle();
        director.construct(carBuilder);
        Product someCar = carBuilder.getVehicle();
        someCar.show();
        director.construct(motorcycleBuilder);
        Product someBike = motorcycleBuilder.getVehicle();
        someBike.show();



    }
}
