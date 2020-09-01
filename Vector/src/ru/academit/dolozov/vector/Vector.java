package ru.academit.dolozov.vector;

import java.util.Arrays;

public class Vector {
    double[] arrayVector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Размер вектора должен быть больше 0");
        }
        this.arrayVector = new double[n];
    }

    public Vector(double[] array) {
        int n = array.length;
        this.arrayVector = new double[n];

        for (int i = 0; i < n; i++) {
            arrayVector[i] = array[i];
        }
    }

    public Vector(int n, double[] array) {
        if (n <= 0) {
            throw new IllegalArgumentException("Размер вектора должен быть больше 0");
        }

        this.arrayVector = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < array.length) {
                arrayVector[i] = array[i];
            } else {
                arrayVector[i] = 0;
            }
        }
    }

    public int getSize (){
        return arrayVector.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayVector);
    }
}
