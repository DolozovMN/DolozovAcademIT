package ru.academit.dolozov.shapes;

public class Rectangle implements Shape {
    private double rectangleHeight;
    private double rectangleWidth;

    public Rectangle(double rectangleHeight, double rectangleWidth) {
        this.rectangleHeight = rectangleHeight;
        this.rectangleWidth = rectangleWidth;
    }

    @Override
    public double getWidth() {
        return this.rectangleWidth;
    }

    @Override
    public double getHeight() {
        return this.rectangleHeight;
    }

    @Override
    public double getArea() {
        return this.rectangleHeight * rectangleWidth;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.rectangleHeight + 2 * this.rectangleWidth;
    }

    @Override
    public String toString() {
        return "высота: " + rectangleHeight + "ширина: " + rectangleWidth;
    }
}
