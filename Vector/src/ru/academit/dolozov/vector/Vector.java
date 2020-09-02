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

    public Vector(Vector vector) {
        this.arrayVector = vector.arrayVector;
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

    public void addVector(Vector vector) {
        int n1 = arrayVector.length;
        int n2 = vector.arrayVector.length;

        if (n1 > n2) {
            for (int i = 0; i < n1; i++) {
                if (i < n2) {
                    arrayVector[i] = arrayVector[i] + vector.arrayVector[i];
                } else {
                    arrayVector[i] = arrayVector[i];
                }
            }
        } else {
            for (int i = 0; i < n1; i++) {
                arrayVector[i] = arrayVector[i] + vector.arrayVector[i];
            }
        }
    }

    public void minusVector(Vector vector) {
        int n1 = arrayVector.length;
        int n2 = vector.arrayVector.length;

        if (n1 > n2) {
            for (int i = 0; i < n1; i++) {
                if (i < n2) {
                    arrayVector[i] = arrayVector[i] - vector.arrayVector[i];
                } else {
                    arrayVector[i] = arrayVector[i];
                }
            }
        } else {
            for (int i = 0; i < n1; i++) {
                arrayVector[i] = arrayVector[i] - vector.arrayVector[i];
            }
        }
    }

    public void multiplyOnScalar(int scalar) {
        int n = arrayVector.length;

        for (int i = 0; i < n; i++) {
            arrayVector[i] = arrayVector[i] * scalar;
        }
    }

    public void expandVector() {
        int n = arrayVector.length;

        for (int i = 0; i < n; i++) {
            arrayVector[i] = -1 * arrayVector[i];
        }
    }

    public double getVectorElement(int index) {
        int n = arrayVector.length;

        if (index < 0 || index >= n) {
            throw new IllegalArgumentException("Недопустимый индекс элемента вектора");
        }

        return arrayVector[index];
    }

    public double getVectorLength() {
        double sum = 0;

        for (double arrayElement : arrayVector) {
            sum = sum + arrayElement;
        }

        return sum;
    }

    public static Vector getVectorSum(Vector vector1, Vector vector2) {
        int n1 = vector1.arrayVector.length;
        int n2 = vector2.arrayVector.length;
        int nMax = Math.max(n1, n2);
        double[] arraySum = new double[nMax];

        if (n1 > n2) {
            for (int i = 0; i < nMax; i++) {
                if (i < n2) {
                    arraySum[i] = vector1.arrayVector[i] + vector2.arrayVector[i];
                } else {
                    arraySum[i] = vector1.arrayVector[i];
                }
            }
        } else {
            for (int i = 0; i < nMax; i++) {
                if (i < n1) {
                    arraySum[i] = vector1.arrayVector[i] + vector2.arrayVector[i];
                } else {
                    arraySum[i] = vector2.arrayVector[i];
                }
            }
        }

        return new Vector(arraySum);
    }

    public static Vector getVectorDifference(Vector vector1, Vector vector2) {
        int n1 = vector1.arrayVector.length;
        int n2 = vector2.arrayVector.length;
        int nMax = Math.max(n1, n2);
        double[] arrayDiff = new double[nMax];

        if (n1 > n2) {
            for (int i = 0; i < nMax; i++) {
                if (i < n2) {
                    arrayDiff[i] = vector1.arrayVector[i] - vector2.arrayVector[i];
                } else {
                    arrayDiff[i] = vector1.arrayVector[i];
                }
            }
        } else {
            for (int i = 0; i < nMax; i++) {
                if (i < n1) {
                    arrayDiff[i] = vector1.arrayVector[i] - vector2.arrayVector[i];
                } else {
                    arrayDiff[i] = 0 - vector2.arrayVector[i];
                }
            }
        }

        return new Vector(arrayDiff);
    }

    public static Vector getVectorComposition(Vector vector1, Vector vector2) {
        int n1 = vector1.arrayVector.length;
        int n2 = vector2.arrayVector.length;
        int nMax = Math.max(n1, n2);
        double[] arrayComposition = new double[nMax];

        for (int i = 0; i < nMax; i++) {
            double factor1;
            double factor2;

            if (i < n1) {
                factor1 = vector1.arrayVector[i];
            } else {
                factor1 = 0;
            }

            if (i < n2) {
                factor2 = vector2.arrayVector[i];
            } else {
                factor2 = 0;
            }

            arrayComposition[i] = factor1 * factor2;
        }

        return new Vector(arrayComposition);
    }

    public int getSize() {
        return arrayVector.length;
    }

    @Override
    public int hashCode() {
        final int prime = 29;
        int hash = 1;
        for (double element : arrayVector) {
            hash = prime * hash + Double.hashCode(element);
        }
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

        Vector vector = (Vector) o;
        return (Arrays.equals(this.arrayVector, vector.arrayVector));
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayVector);
    }
}
