package com.ua.creational.builder.challenge;

public class Client {
    public static void main(String[] args) {
        //ChallengeTask

        DirectorChallengeTask directorChallengeTask = new DirectorChallengeTask();
        MealBuilderInterface veggieMealBuilder = new VeggieMealBuilder();
        MealBuilderInterface nonVeggieMealBuilder = new NonVeggieMealBuilder();

        directorChallengeTask.construct(veggieMealBuilder);
        BuilderChallengeTaskMeal
                veggieMeal = veggieMealBuilder.getMeal();
        veggieMeal.showItems();
        System.out.println("veggie meal totals: " + veggieMeal.getCoast());

        directorChallengeTask.construct(nonVeggieMealBuilder);
        BuilderChallengeTaskMeal
                nonVeggieMeal = nonVeggieMealBuilder.getMeal();
        nonVeggieMeal.showItems();
        System.out.println("non Veggie Meal meal totals: " + nonVeggieMeal.getCoast());
    }
}
