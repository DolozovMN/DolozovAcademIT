package ru.academit.dolozov.vector_main;

import ru.academit.dolozov.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5);
        double[] array1 = {1, 2, 3, 4};
        double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        double[] array3 = {0, 2.5, 3.5, 4.5, 10};

        Vector vector2 = new Vector(array1);
        Vector vector3 = new Vector(6, array2);
        Vector vector4 = new Vector(vector2);
        Vector vector5 = new Vector(array1);
        Vector vector6 = new Vector(array3);

        System.out.println("Вектор 1: " + vector1.toString() + " размерность вектора: " + vector1.getSize());
        System.out.println("Вектор 2: " + vector2.toString() + " размерность вектора: " + vector2.getSize());
        System.out.println("Вектор 3: " + vector3.toString() + " размерность вектора: " + vector3.getSize());
        System.out.println("Вектор 4: " + vector4.toString() + " размерность вектора: " + vector4.getSize());
        System.out.println("Вектор 5: " + vector5.toString() + " размерность вектора: " + vector5.getSize());
        System.out.println("Вектор 6: " + vector6.toString() + " размерность вектора: " + vector6.getSize());

        System.out.println("Проверка равенства: " + vector2.equals(vector5));
        System.out.println();

        System.out.println("Длина вектора 6: " + vector6.getVectorLength());

        Vector vectorSum = Vector.getVectorSum(vector2, vector6);
        System.out.println("Суммарный вектор 2 и 6 (Новый): " + vectorSum.toString());

        Vector vectorDiff = Vector.getVectorDifference(vector2, vector6);
        System.out.println("Вектор разности 2-6 (Новый): " + vectorDiff.toString());

        Vector vectorComposition = Vector.getVectorComposition(vector2, vector6);
        System.out.println("Вектор произведения 2-6 (Новый): " + vectorComposition.toString());

        vector4.expandVector();
        System.out.println("Разворот вектора 4: " + vector4.toString());

        vector2.minusVector(vector6);
        System.out.println("Вектор 2 - 6: " + vector2.toString());

        vector6.addVector(vector5);
        System.out.println("Вектор 6 + 5: " + vector6.toString());

        vector5.multiplyOnScalar(3);
        System.out.println("Умножение вектора 5 на скаляр:" + vector5.toString());

        System.out.println("Элемент вектора: " + vector6.getVectorElement(3));
    }
}
