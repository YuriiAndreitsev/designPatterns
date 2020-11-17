package com.ua.creational.builder.challenge;

public interface MealBuilderInterface {
    void buildBurger();

    void buildDrink();

    BuilderChallengeTaskMeal getMeal();
}

class VeggieMealBuilder implements MealBuilderInterface {

    private BuilderChallengeTaskMeal veggieMeal = new BuilderChallengeTaskMeal();

    @Override
    public void buildBurger() {
        veggieMeal.addItem(new VeggieBurger());
    }

    @Override
    public void buildDrink() {
        veggieMeal.addItem(new Coke());
    }

    @Override
    public BuilderChallengeTaskMeal getMeal() {
        return veggieMeal;
    }
}

class NonVeggieMealBuilder implements MealBuilderInterface {

    private BuilderChallengeTaskMeal nonVeggie = new BuilderChallengeTaskMeal();

    @Override
    public void buildBurger() {
        nonVeggie.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVeggie.addItem(new Pepsi());
    }

    @Override
    public BuilderChallengeTaskMeal getMeal() {
        return nonVeggie;
    }
}
