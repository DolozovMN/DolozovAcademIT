package ru.academit.dolozov.shapes;

public class Circle implements Shape {
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double getWidth() {
        return 2 * circleRadius;
    }

    @Override
    public double getHeight() {
        return 2 * circleRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * circleRadius * circleRadius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * circleRadius;
    }

    @Override
    public String toString() {
        return "Окружность высотой: " + 2 * circleRadius + " шириной: " + 2 * circleRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Circle circle = (Circle) o;
        return circleRadius == circle.circleRadius;
    }
}
