package ru.academit.dolozov.shapes_main;

import ru.academit.dolozov.shapes.*;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Triangle triangle1 = new Triangle(0, 0, 10, 10, 20, 0);
        Rectangle rectangle1 = new Rectangle(10, 30);
        Circle circle1 = new Circle(25);

        Shape Array[] = {square1, triangle1, rectangle1, circle1};

    }
}
