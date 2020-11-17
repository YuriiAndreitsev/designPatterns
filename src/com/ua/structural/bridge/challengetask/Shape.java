package com.ua.structural.bridge.challengetask;

abstract class Shape {
    protected ColorInterface color;

    protected Shape(ColorInterface color) {
        this.color = color;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape{
    protected Triangle(ColorInterface color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Triangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("Changing border width "+increment+"times");
        border = border*increment;
        drawShape(border);
    }
}


class Rectangle extends Shape{
    protected Rectangle(ColorInterface color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Rectangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("Changing border width "+increment+"times");
        border = border*increment;
        drawShape(border);
    }
}