package com.ua.creational.prototype;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("It is a Rectangle draw()");
    }
}

class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("It is a Square draw()");
    }
}

class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("It is a Circle draw()");
    }
}