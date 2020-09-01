package ru.academit.dolozov.vector_main;

import ru.academit.dolozov.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5);
        double[] array1 = {1, 2, 3, 4};
        double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        Vector vector2 = new Vector(array1);
        Vector vector3 = new Vector(10, array2);
        Vector vector4 = new Vector(vector2);
        Vector vector5 = new Vector(array1);

        System.out.println(vector1.toString() + " размерность вектора: " + vector1.getSize() + " хэш-код: " + vector1.hashCode());
        System.out.println(vector2.toString() + " размерность вектора: " + vector2.getSize() + " хэш-код: " + vector2.hashCode());
        System.out.println(vector3.toString() + " размерность вектора: " + vector3.getSize() + " хэш-код: " + vector3.hashCode());
        System.out.println(vector4.toString() + " размерность вектора: " + vector4.getSize() + " хэш-код: " + vector4.hashCode());
        System.out.println(vector5.toString() + " размерность вектора: " + vector5.getSize() + " хэш-код: " + vector5.hashCode());

        System.out.println(vector2.equals(vector5));
    }
}
