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
        return "Прямоугольник высотой: " + rectangleHeight + " шириной: " + rectangleWidth;
    }

    @Override
    public int hashCode() {
        final int prime = 29;
        int hash = 1;
        hash = prime * hash + Double.hashCode(rectangleHeight);
        hash = prime * hash + Double.hashCode(rectangleWidth);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass() || o.hashCode() != this.hashCode()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;
        return rectangleHeight == rectangle.rectangleHeight && rectangleWidth == rectangle.rectangleWidth;
    }
}
