package ru.academit.dolozov.shapes_main;

import ru.academit.dolozov.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Triangle triangle1 = new Triangle(0, 0, 10, 15, 20, 0);
        Rectangle rectangle1 = new Rectangle(10, 30);
        Circle circle1 = new Circle(5);

        Shape[] arrayShapes = {square1, triangle1, rectangle1, circle1};
        int shapesCount = arrayShapes.length;
        double[] arrayAreas = new double[shapesCount];
        double[] arrayPerimeter = new double[shapesCount];

        for (int i = 0; i < shapesCount; i++) {
            arrayAreas[i] = arrayShapes[i].getArea();
            arrayPerimeter[i] = arrayShapes[i].getPerimeter();
        }

        Arrays.sort(arrayAreas);
        Arrays.sort(arrayPerimeter);

        System.out.println(Arrays.toString(arrayAreas));
        System.out.println(Arrays.toString(arrayPerimeter));

        System.out.println("Фигура с наибольшей площадью: " +arrayShapes[shapesCount-1].toString());
    }
}
