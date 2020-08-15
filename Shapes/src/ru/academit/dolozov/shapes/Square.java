package ru.academit.dolozov.shapes;

public class Square implements Shape {
    private double sizeLength;

    public Square(double sizeLength) {
        this.sizeLength = sizeLength;
    }

    @Override
    public double getWidth() {
        return this.sizeLength;
    }

    @Override
    public double getHeight() {
        return this.sizeLength;
    }

    @Override
    public double getArea() {
        return this.sizeLength * this.sizeLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.sizeLength;
    }

    @Override
    public String toString() {
        return "высота: " + sizeLength + "ширина: " + sizeLength;
    }
}
