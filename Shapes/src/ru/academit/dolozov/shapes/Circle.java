package ru.academit.dolozov.shapes;

public class Circle implements Shape {
    private double circleRadius;

    public Circle (double circleRadius){
        this.circleRadius = circleRadius;
    }

    @Override
    public double getWidth() {
        return 2*circleRadius;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
