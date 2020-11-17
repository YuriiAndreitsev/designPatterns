package com.ua.creational.builder.challenge;

public class DirectorChallengeTask {

    MealBuilderInterface builder;

    public void construct (MealBuilderInterface builder){
        this.builder = builder;
        builder.buildBurger();
        builder.buildDrink();
        builder.getMeal();
    }
}
