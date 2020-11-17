package com.ua.creational.factory.challengeTask;

public class ConcreteAnimalFactory extends AbstractAnimalFactory {
    @Override
    public Animal getAnimal(String animalType) throws Exception {
        {
            switch (animalType) {
                case "duck":
                    return new Duck();

                case "tiger":
                    return new Tiger();

                default:
                    throw new Exception("Animal type " + animalType + " cannot be instantiated");
            }
        }
    }
}
