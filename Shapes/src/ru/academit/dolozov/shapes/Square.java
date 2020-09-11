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
        return this.side;
    }

    @Override
    public double getHeight() {
        return this.side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Квадрат, высотой: " + side + " шириной: " + side + " площадью: " + String.format("%.2f", getArea()) +
                " периметром: " + String.format("%.2f", getPerimeter());
    }

    @Override
    public int hashCode() {
        return Double.hashCode(side);
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
