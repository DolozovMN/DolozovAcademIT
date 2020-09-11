package ru.academit.dolozov.shapes_main;

import ru.academit.dolozov.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Triangle triangle1 = new Triangle(0, 0, 10, 15, 20, 0);
        Rectangle rectangle1 = new Rectangle(20, 30);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Rectangle rectangle2 = new Rectangle(5, 25);
        Square square2 = new Square(20);

        Shape[] arrayShapes = {square1, triangle1, rectangle1, circle1, circle2, rectangle2, square2};

        /*- Код для расчета массива площадей и периметров фигур для проверки
        double[] arrayAreas = new double[arrayShapes.length];
        double[] arrayPerimeter = new double[arrayShapes.length];

        for (int i = 0; i < arrayShapes.length; i++) {
            arrayAreas[i] = arrayShapes[i].getArea();
            arrayPerimeter[i] = arrayShapes[i].getPerimeter();
        }

        System.out.println("Площади фигур: " + Arrays.toString(arrayAreas));
        System.out.println("Периметры фигур: " + Arrays.toString(arrayPerimeter));
         */

        AreaComparator areaComparator = new AreaComparator();
        Arrays.sort(arrayShapes, areaComparator);
        System.out.println("Фигура с наибольшей площадью: " + arrayShapes[arrayShapes.length - 1]);

        PerimeterComparator perimeterComparator = new PerimeterComparator();
        Arrays.sort(arrayShapes, perimeterComparator);
        System.out.println("Фигура со вторым по величине периметром: " + arrayShapes[arrayShapes.length - 2].toString());
    }
}
