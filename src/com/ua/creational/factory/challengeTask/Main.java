package com.ua.creational.factory.challengeTask;

public class Main {
    public static void main(String[] args) {
        AbstractAnimalFactory animalFactory = new ConcreteAnimalFactory();
        try {
            Animal tiger = animalFactory.getAnimal("tiger");
            tiger.makeSound();

            Animal duck = animalFactory.getAnimal("duck");
            duck.makeSound();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
