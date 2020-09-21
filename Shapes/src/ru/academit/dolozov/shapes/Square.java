package ru.academit.dolozov.shapes;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return String.format("Квадрат, высотой: %.2f, шириной: %.2f, площадью: %.2f, периметром: %.2f", side, side, getArea(), getPerimeter());
    }

    @Override
    public int hashCode() {
        final int prime = 29;
        int hash = 1;
        hash = prime * hash + Double.hashCode(side);
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

        Square square = (Square) o;

        return side == square.side;
    }
}
