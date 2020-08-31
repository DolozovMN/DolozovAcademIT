package ru.academit.dolozov.shapes;

public class Triangle implements Shape {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    @Override
    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }

    public double getSizeAB() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getSizeBC() {
        return  Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    }

    public double getSizeAC() {
        return  Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))
                + Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }

    @Override
    public String toString() {
        return "Триугольник высотой: " + getHeight() + " шириной: " + getWidth();
    }

    @Override
    public int hashCode (){
        final int prime = 29;
        int hash = 1;
        hash = prime * hash + Double.hashCode(this.getSizeAB());
        hash = prime * hash + Double.hashCode(this.getSizeBC());
        hash = prime * hash + Double.hashCode(this.getSizeAC());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass() || this.hashCode() != o.hashCode()) {
            return false;
        }

        Triangle triangle = (Triangle) o;
        return this.getSizeAB() == triangle.getSizeAB() && this.getSizeBC() == triangle.getSizeBC() && this.getSizeAC() == triangle.getSizeAC();
    }
}