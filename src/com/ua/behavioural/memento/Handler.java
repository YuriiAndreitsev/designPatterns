package com.ua.behavioural.memento;

import java.util.ArrayList;

public class Handler {
    private final ArrayList<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
