package ru.academit.dolozov.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return this.height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.height + 2 * this.width;
    }

    @Override
    public String toString() {
        return "Прямоугольник высотой: " + height + " шириной: " + width + " площадью: " + String.format("%.2f", getArea()) +
                " периметром: " + String.format("%.2f", getPerimeter());
    }

    @Override
    public int hashCode() {
        final int prime = 29;
        int hash = 1;
        hash = prime * hash + Double.hashCode(height);
        hash = prime * hash + Double.hashCode(width);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;

        return height == rectangle.height && width == rectangle.width;
    }
}
