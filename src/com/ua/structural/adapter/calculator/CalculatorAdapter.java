package com.ua.structural.adapter.calculator;

public class CalculatorAdapter implements CalculatorInterface {

    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle r = new Rectangle();
        r.length = triangle.base;
        r.width = 0.5 * triangle.height;
        return calculator.getArea(r);
    }
}
