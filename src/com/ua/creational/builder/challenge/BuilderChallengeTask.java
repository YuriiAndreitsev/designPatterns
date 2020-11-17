package com.ua.creational.builder.challenge;

public class BuilderChallengeTask {
}

interface Item {
    public String name();

    public Packing packing();

    public float price();
}

abstract class Burger implements Item {
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

class VeggieBurger extends Burger {

    @Override
    public float price() {
        return 25.9f;
    }

    @Override
    public String name() {
        return "VeggieBurger";
    }
}

class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 59.9f;
    }
}

abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi Light";
    }

    @Override
    public float price() {
        return 29.9f;
    }
}

class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 29.9f;
    }
}

interface Packing {
    public String pack();
}

class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}